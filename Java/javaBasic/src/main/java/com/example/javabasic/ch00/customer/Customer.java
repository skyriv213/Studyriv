package com.example.javabasic.ch00.customer;

import com.example.javabasic.ch00.menu.drink.Drink;

import java.time.LocalDate;

public class Customer implements People {

    private String id;

    public Drink drink;
    public TakeOrSeats takeOrSeats;
    private int money;

    private int cnt;
    private Grade grade;

    public Customer() {
    }

    public Customer(int money, Grade grade, String id) {
        this.money = money;
        this.grade = grade;
        this.id = id;
    }

    public Customer create() {
        int number = (int) Math.random();
        int money = number * 10000;
        String id = LocalDate.now() + String.valueOf(number * 10);
        int seats = (number * 10000) % 10;

        Customer customer = new Customer(money, Grade.BASIC, id);
        customer.setSeats(seats);


        return customer;
    }


    // 임의의 난수를 받아서 범위에 따라 매장내 고객과 테이크 아웃 고객으로 판단
    public void setSeats(int num) {
        if (num > 1 && num < 5) {
            setTakeOrSeats(TakeOrSeats.Take_Out);
        } else {
            setTakeOrSeats(TakeOrSeats.SEATS);
        }
    }

    // 음료를 주문하고 등급을 확인하고 가격에 따라 주문하기
    public void orderSomething(Drink drink) {
        int price = drink.getPrice();
        if (this.grade == Grade.VIP) {
            price -= 1000;
        }
        money -= price;
        this.cnt += 1;
        setMoney(money);
        upgradeGrade(cnt);
        this.drink = drink;
    }

    public void drinkSomething() {
        drink.drinking();
    }

    public void setTakeOrSeats(TakeOrSeats takeOrSeats) {
        this.takeOrSeats = takeOrSeats;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public TakeOrSeats getTakeOrSeats() {
        return takeOrSeats;
    }

    // 등급업 메서드
    public void upgradeGrade(int cnt) {
        if (cnt >= 30) {
            this.grade = Grade.VIP;
        }
    }


    // customer 정보 출력

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", drink=" + drink +
                ", takeOrSeats=" + takeOrSeats +
                ", money=" + money +
                ", cnt=" + cnt +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int getMoney() {
        return this.money;
    }
}
