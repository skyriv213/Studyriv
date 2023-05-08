package com.example.kafka;

import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageListener {

    @KafkaListener(topics = "dev-topic")
    public void messageListener(ConsumerRecord<String, String> record,
        Acknowledgment acknowledgment) {
        log.info("### record : " + record.toString());
        log.info("### topic : " + record.topic() + ", value : " + record.value() + ", offset: "
            + record.offset());
        acknowledgment.acknowledge();
    }
}
