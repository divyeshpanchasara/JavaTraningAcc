package com.day3.abstraction;

public class Car extends Vehicle{

    @Override
    void drive() {
        System.out.println("Driving a Car!!");
    }

    public Car(){
        System.out.println("I am a Car!!");
    }

}
