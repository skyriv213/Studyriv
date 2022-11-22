package com.example.javabasic.ch00;

import com.example.javabasic.ch00.customer.Customer;
import com.example.javabasic.ch00.customer.TakeOrSeats;
import com.example.javabasic.ch00.menu.drink.Americano;
import com.example.javabasic.ch00.menu.drink.Drink;

import java.util.ArrayList;
import java.util.List;

public class Cafe {

    static int sales = 0;
    static int seat = 150;

    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>();

        Customer customerAction = new Customer();

        for(int i = 0; i< 10;i++){
            Customer customer = customerAction.create();

            int v = (int)((Math.random() * 10000)%10);
            Drink Ice_Americano = new Americano(500, v);
            customer.orderSomething(Ice_Americano);
            sales += Ice_Americano.getPrice();
            checkSeats(customer);
            System.out.println(customer.toString());
            customer.drinkSomething();
            System.out.println("남은 음료 :"+customer.drink.getMl());

            customerList.add(customer);

        }

        System.out.println("sales = " + sales);
        System.out.println("seats = " + seat);

        System.out.println(customerList);
    }

    private static void checkSeats(Customer customer) {
        if(customer.getTakeOrSeats()== TakeOrSeats.SEATS){
            seat -= 1;
        }
        if(seat == 0 ){
            System.out.println("현재 남은좌석이 없습니다");
        }
    }
}
