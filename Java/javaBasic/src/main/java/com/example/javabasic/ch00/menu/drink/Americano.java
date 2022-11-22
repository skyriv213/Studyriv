package com.example.javabasic.ch00.menu.drink;

public class Americano implements Drink {
    public int price, ml, kcal;
    public Temperature temperature;

    public Americano(int ml, int v) {
        this.ml = ml;
        if(v>=1 && v<5){
            this.temperature = Temperature.HOT;
        }
        else{
            this.temperature = Temperature.ICE;
        }
        if (temperature == Temperature.HOT) {
            this.price = 1500;
            this.kcal = 150;
        } else {
            this.price = 2000;
            this.kcal = 180;
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
