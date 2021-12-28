package com.example.HelloSpring.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 해당 class는 REST API를 처리하는 Controller,
@RequestMapping("/api") // RequestMapping URI를 지정해주는 Annotation -> 주소를 할당하기 위해서는 필수적으로 RequestMapping을 사용해야함
public class ApiController {


    @GetMapping("/hello")  // http://localhost:9090/api/hello
    public String hello(){
        return "hello spring boot!";
    }

}
