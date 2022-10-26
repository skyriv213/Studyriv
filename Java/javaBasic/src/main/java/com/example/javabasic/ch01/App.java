package com.example.javabasic.ch01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        Function<Integer, String> intTOString = (i) -> "number";

        Greeting greeting = new Greeting();

        UnaryOperator<String> hi1 = (s)->"hi " +s; // 원형
        UnaryOperator<String> hi2 = Greeting::hi; // 스태틱 메서드 참조
        UnaryOperator<String> hello = greeting::hello; // 특정 객체의 인스턴스 메서드 참조
        Supplier<Greeting> newGreeting = Greeting::new; // 생성자 참조
        Greeting greeting1 = newGreeting.get(); // 참조하여 Greeting 객체 생성

        Function<String, Greeting> minsooGreeting
                =  Greeting::new;
        Greeting minsoo = minsooGreeting.apply("minsoo");
        System.out.println("minsoo.getName() = " + minsoo.getName());

        String[] names = {"daSD", "asdasfdsf", "qwewe"};
        Arrays.sort(names, String::compareToIgnoreCase); // 임의 객체의 인스턴스 메서드 참조
        System.out.println(Arrays.toString(names));

    }

}
