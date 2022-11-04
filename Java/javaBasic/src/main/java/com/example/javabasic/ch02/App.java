package com.example.javabasic.ch02;

public class App {

    public static void main(String[] args) {
        Foo foo = new DefaultFoo("minsoo");
        foo.printName();
        foo.printNameUpperCase();

        Foo.printAny();
    }
}
