package com.example.basicsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    protected void configure(HttpSecurity http) throws Exception {
         // 인가 API, 어떠한 요청에도 검사를 인증을 받도록
        http
                .authorizeHttpRequests()
                .anyRequest().authenticated();
        // 인증 API
        http
                .formLogin();
    }

}
