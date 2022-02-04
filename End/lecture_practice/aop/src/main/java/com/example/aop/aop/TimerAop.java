package com.example.aop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class TimerAop {

    @Pointcut("execution(* com.example.aop.controller..*.*(..))")
    private void Cut() {}

    @Pointcut("@annotation(com.example.aop.annotation.Timer)")
    private void enableTimer(){

    }

    @Around("Cut && enableTimer()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();


       Object result = joinPoint.proceed();

        stopWatch.stop();
        System.out.println("total time : "  +stopWatch.getTotalTimeSeconds());

    }


}

/*
Bean / Component의 차이
Bean의 경우 class에 붙일 수 없고, 메소드 단위에만 적용이 된다.
Component를 사용하여 class 단위로 bean을 등록할 수 있다.
 */