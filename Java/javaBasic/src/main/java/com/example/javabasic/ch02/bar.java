package com.example.javabasic.ch02;

public interface bar //extends Foo {
{
    //void printNameUpperCase();
    /***
     * @implSpec
     * 이 구현체는 getName()으로 가져온 문자열을 대문자로 바꿔 출력
     */
    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }
    String getName();

}
