package com.example.javabasic.ch01;

public class Foo {
    public static void main(String[] args) {
        // 익명 내부 클래스 anonymous inner class
        RunSomething runSomething1 = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("hello");
            }
        };

        RunSomething runSomething2 = () -> System.out.println("hello");

        RunSomething runSomething3 = () -> {
            System.out.println("hello");
            System.out.println("hello2");
        };
    }
}
