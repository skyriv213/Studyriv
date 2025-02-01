package com.example.oauth2.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfig {

    private final OAuth2UserService oAuth2UserService;


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                // HTTP Basic 인증 비활성화
                .httpBasic(AbstractHttpConfigurer::disable)
                // CSRF 보호 비활성화
                .csrf(AbstractHttpConfigurer::disable)
                // CORS 설정 (추가 설정이 필요하면 corsCustomizer 사용)
                .cors(Customizer.withDefaults())
                // HTTP 요청에 대한 접근 제어 설정
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/private/**").authenticated()  // '/private/**' 경로는 인증 필요
                        // '/admin/**' 경로는 'ROLE_ADMIN' 권한이 있는 사용자만 접근 가능
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .anyRequest().permitAll()
                )
                // 폼 로그인 설정
                .formLogin(form -> form
                        .loginPage("/loginForm")
                        .usernameParameter("name")  // 로그인 시 사용자 이름 파라미터가 "name"
                        .loginProcessingUrl("/login")
                        .defaultSuccessUrl("/home")
                )
                // OAuth2 로그인 설정
                .oauth2Login(oauth2 -> oauth2
                        .loginPage("/loginForm")
                        .defaultSuccessUrl("/")
                        .userInfoEndpoint(userInfo ->
                                userInfo.userService(oAuth2UserService)
                        )
                )
                .build();
    }
}
