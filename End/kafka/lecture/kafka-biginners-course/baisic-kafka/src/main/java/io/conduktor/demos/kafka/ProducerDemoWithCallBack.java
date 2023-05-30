package io.conduktor.demos.kafka;

import java.util.Properties;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.clients.producer.RoundRobinPartitioner;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProducerDemoWithCallBack {

    private static final Logger log = LoggerFactory.getLogger(
        ProducerDemoWithCallBack.class.getSimpleName());

    public static void main(String[] args) {
        log.info("I am a Kafka Producer!");

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

        // 배치 사이즈도 실제로는 kafka의 기본 설정인 16kb를 사용해야한다
        properties.setProperty("batch.size", "400");
        //상용화 코드에는 쓰면 안되지만 모든 파티션에 전송이 잘되는지 여부를 따지기 위해서
        // 프로퍼티만 바꿔서 사용하는 코드
//        properties.setProperty("partitioner.class", RoundRobinPartitioner.class.getName());

        // create the Producer
        KafkaProducer<String, String> producer = new KafkaProducer<>(properties);

        for (int j = 0; j < 10; j++) {

            for (int i = 0; i < 30; i++) {

                // create a Producer Record
                ProducerRecord<String, String> producerRecord =
                    new ProducerRecord<>("demo_java", "hello world " + i);

                // send data
                producer.send(producerRecord, new Callback() {
                    @Override
                    public void onCompletion(RecordMetadata metadata, Exception e) {
                        // executes every time a record successdully sent or an exception is thrown
                        if (e == null) {
                            log.info("Received new metadata \n" +
                                "Topic: " + metadata.topic() + "\n" +
                                "Partiotion: " + metadata.partition() + "\n" +
                                "Offset: " + metadata.offset() + "\n" +
                                "Timestamp: " + metadata.timestamp()
                            );
                        } else {
                            log.error("Error while producing", e);
                        }
                    }
                });
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // tell the producer to send all data and block until done -- synchronous
        producer.flush();

        // flush and close the producer
        producer.close();

    }
}
