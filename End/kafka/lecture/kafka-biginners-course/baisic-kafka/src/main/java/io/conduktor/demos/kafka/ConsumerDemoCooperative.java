package io.conduktor.demos.kafka;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.CooperativeStickyAssignor;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.errors.WakeupException;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsumerDemoCooperative {

    private static final Logger log = LoggerFactory.getLogger(
        ConsumerDemoCooperative.class.getSimpleName());

    public static void main(String[] args) {
        log.info("I am a Kafka Consumer!");

        String groupId = "my-java-application";
        String topic = "demo_java";

        // create Producer Properties
        Properties properties = new Properties();

        // connect to Localhost
//        properties.setProperty("bootstrap.servers", "127.0.0.1:9092");

        // connect to Conduktor Playground
        properties.setProperty("bootstrap.servers", "cluster.playground.cdkt.io:9092");
        properties.setProperty("security.protocol", "SASL_SSL");
        properties.setProperty("sasl.jaas.config",
            "org.apache.kafka.common.security.plain.PlainLoginModule required username=\"4FaaXbkXeMq82gKUAlvwUj\" password=\"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwczovL2F1dGguY29uZHVrdG9yLmlvIiwic291cmNlQXBwbGljYXRpb24iOiJhZG1pbiIsInVzZXJNYWlsIjpudWxsLCJwYXlsb2FkIjp7InZhbGlkRm9yVXNlcm5hbWUiOiI0RmFhWGJrWGVNcTgyZ0tVQWx2d1VqIiwib3JnYW5pemF0aW9uSWQiOjczNTIyLCJ1c2VySWQiOjg1NDkxLCJmb3JFeHBpcmF0aW9uQ2hlY2siOiI1OWI2NThmMi0yNjU3LTRmNzctYmZmZS1hMTgzYjY0OTZjZjkifX0.qbf7yKniEXSZAaPIFnUlRxiwAAokXFw6bsobDwebc3A\";");
        properties.setProperty("sasl.mechanism", "PLAIN");

        // set producer properties
        properties.setProperty("key.serializer", StringSerializer.class.getName());
        properties.setProperty("value.serializer", StringSerializer.class.getName());

        // create consumer configs
        properties.setProperty("key.deserializer", StringDeserializer.class.getName());
        properties.setProperty("value.deserializer", StringDeserializer.class.getName());

        properties.setProperty("group.id", groupId);

        // none : 설정된 컨슈머 그룹이 없을 때는 동작하지 않는다
        // earliest : 토픽을 맨 처음부터 읽음. kafka cli : --from-beginning
        // latest : 지금부터 메시지를 읽고 방금 보낸 새 메시지만 읽는다
        properties.setProperty("auto.offset.reset", "earliest");
        properties.setProperty("partition.assignment.strategy",
            CooperativeStickyAssignor.class.getName());

        // create a consumer
        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(properties);

        // get a reference to the main thread
        final Thread mainThread = Thread.currentThread();

        // adding the shutDown hook
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                log.info("Deteced a shutDown, let's exit by calling consumer.wakeup()..");
                consumer.wakeup();

                // join the main thread to allow the execution of the code in the main thread
                try {
                    mainThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        //subscribe to a topic

        try {
            consumer.subscribe(Arrays.asList(topic));

            //poll for data
            while (true) {

                ConsumerRecords<String, String> records =
                    consumer.poll(Duration.ofMillis(1000));

                for (ConsumerRecord<String, String> record : records) {
                    log.info("Key: " + record.key() + " value: " + record.value());
                    log.info("Partition: " + record.partition() + " Offset: " + record.offset());
                }
            }
        } catch (WakeupException e) {
            log.info("Consumer is starting to shut down");
        } catch (Exception e) {
            log.error("Unexpected exception in the consumer");

        } finally {
            consumer.close(); // close the consumer, this will also commit offsets
            log.info("The consumer is now gracefully shut down");
        }
    }
}
