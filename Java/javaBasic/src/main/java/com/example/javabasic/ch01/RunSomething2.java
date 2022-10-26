package com.example.javabasic.ch01;


@FunctionalInterface
public interface RunSomething2 {

    int doIt(int number);


    static void printName(){
        System.out.println("minsoo");
    }

    default void printAge() {
        System.out.println("26");
    }
}

// 함수형 인터페이스 하나의 추상 메서드만 존재
