package com.example.javabasic.ch02;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class App2 {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("asda");
        name.add("sdsfda");
        name.add("dafsd");
        name.add("aasddad");

        name.forEach(s->{
            System.out.println("s = " + s);
        });
        System.out.println("----------------");
        name.forEach(System.out::println);
        System.out.println("----------------");
        for (String s : name) {
            System.out.println(s);
        }
        System.out.println("----------------");
        Spliterator<String> spliterator = name.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();
        while(spliterator.tryAdvance(System.out::println));
        System.out.println("----------------");
        while(spliterator1.tryAdvance(System.out::println));
    }
}
