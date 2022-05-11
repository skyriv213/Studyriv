package com.study.stackintelli.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
// 어노테이션이 생성될 수 있는 위치를 지정
// Parameter로 지정하여서 메소드의 파라미터로 선언된 객체에서만 사용가능
// 클래스 선언문에 쓸 수 있는 TYPE 등이 있다
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser {
    // 이 파일을 어노테이션 클래스로 지정
    // LoginUser라는 이름을 가진 어노테이션이 생성

}
