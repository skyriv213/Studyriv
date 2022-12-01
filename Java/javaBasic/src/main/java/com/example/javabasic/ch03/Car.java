package com.example.javabasic.ch03;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.*;

public class Car {

    int number;
    String name;

    public Car(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        List<Car> car = new ArrayList<>();
        for(int i = 1 ; i <= 5; i++){
            Car c = new Car(i, "car " + String.valueOf(i));
            car.add(c);
        }
        car.stream().map(i -> i.getNumber()*10 - i.getNumber()).forEach(System.out::println);
        List<String> r1 = car.stream().map(Car::getName).filter(s -> s.contains("r 1")).collect(Collectors.toList());
        List<String> ar = car.stream().map(Car::getName).filter(s -> s.contains("ar")).collect(Collectors.toList());
        List<Integer> collect = car.stream().map(Car::getNumber).sorted(reverseOrder()).collect(Collectors.toList());
        List<Car> collect1 = car.stream().sorted(comparing(Car::getName).reversed()).collect(Collectors.toList());
        List<Car> collect2 = car.stream().sorted(comparing(Car::getName).thenComparing(Car::getNumber)).collect(Collectors.toList());
        System.out.println(collect1.toString());
        System.out.println(collect2.toString());
        System.out.println(r1);
        System.out.println(ar);
        System.out.println(collect);


    }
}
