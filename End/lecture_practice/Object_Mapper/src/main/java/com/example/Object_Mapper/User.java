package com.example.Object_Mapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private String name;
    private int age;


    @JsonProperty("phone_number")
    private String phoneNumber;

    public User(){
        this.name = null;
        this.age = 0;
        this.phoneNumber =null;
    }

    public User(String name, int age,String phoneNumber){
        this.age = age;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;


    }

    // 만약 따로 메소드를 만들때 get을 붙이면 objectMapper가 해당 객체에 대해서
    // serialize-객체를 저장할 수 있는 데이터 형으로 변환 / deserialize - 변환된 데이터로부터 객체를 복원하는것
    // 을 진행할 때 에러가 발생. 따라서 메소드를 만들 경우 get을 받아온다고 get 을 붙이면 오류가 난다.
    // get이 메소드 명에서 빠져야함
    public User DeaultUser(){
        return new User("default ",0,"0101010101010");
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
