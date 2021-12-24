package com.company.design.Adapter;

public class HairDryer implements Electronic110v{

    @Override
    public void poweron() {
        System.out.println("헤어드라이어 110v on");
    }
}
