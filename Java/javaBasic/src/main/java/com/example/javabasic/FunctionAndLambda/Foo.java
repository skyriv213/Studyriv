package com.example.javabasic.FunctionAndLambda;

public class Foo {
    public static void main(String[] args) {
        // 익명 내부 클래스 anonymous inner class
        RunSomething runSomething1 = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("hello");
            }
        };
        runSomething1.doIt();

        RunSomething runSomething2 = () -> System.out.println("hello"); // 함수형 인터페이스를 인라인으로 구현한 오브젝트

        RunSomething runSomething3 = () -> {
            System.out.println("hello");
            System.out.println("hello2");
        };
    }
}
