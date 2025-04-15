package com.example.javabasic.object;

public abstract class Shape{ //  추상 클래스 선언
    public Shape(){}
    public void paint(){draw();}
    public void draw(){
        System.out.println("Shape");
    };
}
