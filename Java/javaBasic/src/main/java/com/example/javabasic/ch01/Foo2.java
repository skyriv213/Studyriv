package com.example.javabasic.ch01;

import java.util.function.*;

public class Foo2 {
    public static void main(String[] args) {

        UnaryOperator<Integer> plus10 = (number) -> {
            return number + 10;
        };
        Function<Integer, Integer> multiply2 = (i) -> i * 2;

        Function<Integer, Integer> multiAndPlus = plus10.compose(multiply2);



        System.out.println("multiAndPlus = " + multiAndPlus.apply(10));

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

    }
}
