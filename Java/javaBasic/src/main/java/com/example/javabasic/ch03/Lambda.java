package com.example.javabasic.ch03;

@FunctionalInterface
interface Math{
    int Calc(int first, int second);
}

public class Lambda {
    public static void main(String[] args) {
        Math plus = (first, second) -> first + second;
        Math Minus = (first, second) -> first - second;

    }
}
