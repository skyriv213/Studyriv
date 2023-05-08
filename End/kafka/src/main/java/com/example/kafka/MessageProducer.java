package com.example.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("kafka")
@RestController
@RequiredArgsConstructor
public class MessageProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    private static String TOPIC_NAME = "dev-topic";

    @GetMapping("producer")
    public String sendMessage(){
        String messageData = "kafka message";
        kafkaTemplate.send(TOPIC_NAME, messageData);
        return "success";
    }

}
