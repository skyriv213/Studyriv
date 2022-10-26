package com.example.javabasic.ch01;

import java.util.function.*;

public class Foo2 {
    public static void main(String[] args) {

        // 자바 제공 함수형 인터페이스
        // 타입동일한 두개의 변수
        UnaryOperator<Integer> plus10 = (number) -> {
            return number + 10;
        };
        // 타입 지정 함수
        Function<Integer, Integer> multiply2 = (i) -> i * 2;

        // plus(multi())
        Function<Integer, Integer> multiAndPlus = plus10.compose(multiply2);

        System.out.println("multiAndPlus = " + multiAndPlus.apply(10));

        //
        Function<Integer, Integer> multiAndPlus2 = plus10.andThen(multiply2);

        System.out.println("multiAndPlus2 = " + multiAndPlus2.apply(2));


        Consumer<Integer> printT = (i) -> System.out.println("i = " + i);

        Supplier<Integer> get10 = () -> 10;
        printT.accept(get10.get());

        Predicate<String> startsWithMinsoo = (s) -> s.startsWith("minsoo");
        Predicate<Integer> isEven = (i) -> i % 2 == 0;

        int basicNumber = 10;
        // 익명 내부 클래스 anonymous inner class
        RunSomething2 runSomething1 = new RunSomething2() {
            @Override
            public int doIt(int number) {
                return number + basicNumber;
            }
        };
        RunSomething2 runSomething2 = number -> number + basicNumber;
        Foo2 foo2 = new Foo2();
        foo2.run();
    }

    private void run() {
        int baseNumber = 10;

        // 로컬 클래스
        class LocalClass {
            void printBaseNumber() {
                int baseNumber = 11;
                System.out.println(baseNumber); // 11
            }
        }
        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(baseNumber);
            }
        };

        // 람다
        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNumber);
        };

    }
}
