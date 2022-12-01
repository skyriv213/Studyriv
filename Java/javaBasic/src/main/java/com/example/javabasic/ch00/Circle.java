package com.example.javabasic.ch00;

public class Circle extends Shape {
    int i = 1;

    public int getI() {
        return i;
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }

    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.paint();

    }

}
