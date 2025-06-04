package com.example.javabasic.object.menu.drink;

public class Latte implements Drink {
    public int price, ml, kcal;
    public Temperature temperature;

    public Latte(int ml, Temperature temperature) {
        this.ml = ml;
        this.temperature = temperature;
        if (temperature == Temperature.HOT) {
            this.price = 3500;
            this.kcal = 250;
        } else {
            this.price = 4000;
            this.kcal = 480;
        }
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public int getKcal() {
        return this.kcal;
    }

    @Override
    public int getMl() {
        return this.ml;
    }

    @Override
    public void drinking() {
        if (this.ml <= 0) {
            System.out.println("남은 음료가 존재하지 않습니다");
        } else {
            this.ml = getMl() - 50;
        }
    }
}
