package com.example.javabasic.ch00;

import java.util.stream.Stream;

public class IPhone implements Phone {

    @Override
    public void play() {
        System.out.println("play");
    }

    @Override
    public void game() {
        System.out.println("game");
    }

    @Override
    public void call() {
        System.out.println("call");
    }

    public static void main(String[] args) {
        Phone p = new IPhone();
    }

}
