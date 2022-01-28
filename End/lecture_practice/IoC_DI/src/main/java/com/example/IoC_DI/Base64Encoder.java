package com.example.IoC_DI;

import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.Base64;


@Component("base74Encoder")
/*
spring 에서 bean으로 만들어서 관리해
bean  - POJO(plain old java object)를 의미
        - 특정 규약/ 특정 환경에 종속되지 않는 객체
 */
public class Base64Encoder implements IEncoder {
    public String encode(String message){
        return Base64.getEncoder().encodeToString(message.getBytes());
    }

}
