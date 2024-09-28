package com.day3.abstraction;

public class Bus extends Vehicle{
    @Override
    void drive() {
        System.out.println("Driving a Bus!!");
    }

    public Bus(){
        System.out.println("I am a Bus!!");
    }
}
