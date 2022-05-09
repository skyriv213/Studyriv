package com.study.stackintelli.web;

import com.study.stackintelli.web.dto.BeginResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeginController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public BeginResponseDto beginDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {
        return new BeginResponseDto(
                name, amount
        );

    }
}
