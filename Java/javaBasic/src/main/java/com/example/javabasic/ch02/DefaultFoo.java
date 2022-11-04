package com.example.javabasic.ch02;

public class DefaultFoo implements Foo{

    String name;

    public DefaultFoo(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void printNameUpperCase() {
        Foo.super.printNameUpperCase();
    }
}
