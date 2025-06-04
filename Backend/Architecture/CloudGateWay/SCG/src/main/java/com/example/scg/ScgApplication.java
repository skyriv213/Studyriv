package com.example.scg;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScgApplication {

    @Value("${service.ms1}")
    private String serviceMs1;

    @Value("${service.ms2}")
    private String serviceMs2;

    public static void main(String[] args) {
        SpringApplication.run(ScgApplication.class, args);
    }

    @PostConstruct
    public void init(){
        System.out.println(serviceMs1);
        System.out.println(serviceMs2);
    }

}
