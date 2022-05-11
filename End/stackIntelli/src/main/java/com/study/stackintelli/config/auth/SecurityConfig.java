package com.study.stackintelli.config.auth;

import com.study.stackintelli.domain.user.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@RequiredArgsConstructor
@EnableWebSecurity // Spring Security의 설정들을 활성화
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final CustomOAuth2UserService customOAuth2UserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .headers().frameOptions().disable()// h2-console의 화면을 이용하기위해 해당 옵션을 disable
                .and()
                .authorizeHttpRequests()//  url별 권한 관리를 설정하는 옵션의 시작점. 해당 옵션이 실행되어야 antMatcher 사용가능
                // antMatchers : 권한 관리 대상을 지정하는 옵션
                // url, http 메소드 별로 관리가 가능
                .antMatchers("/", "/css/**", "/images/**",
                        "/js/**", "/h2-console/**").permitAll()
                .antMatchers("/api/v1/**").hasRole(Role.USER.name())
                .anyRequest().authenticated()
                // 설정 이외의 나머지 url들을 표시 / authenticated의 추가로 나머지 url들은
                // 모두 인증된 사용자들에게만 허용되게 한다.
                .and()
                .logout() //
                .logoutSuccessUrl("/")
                .and()
                .oauth2Login()
                .userInfoEndpoint()
                .userService(customOAuth2UserService);
    }
}
