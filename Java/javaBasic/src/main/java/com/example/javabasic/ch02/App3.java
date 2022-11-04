package com.example.javabasic.ch02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App3 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("asda");
        name.add("sdsfda");
        name.add("dafsd");
        name.add("aasddad");

        System.out.println( name.stream().map(String::toUpperCase)
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList()));

        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        name.sort(compareToIgnoreCase.reversed());
        System.out.println(name);





    }
}
