package com.day11java8features.activity1;

public interface Vehicle {

    default void testDrive(){
        System.out.println("Driving a vehicle.");
    }
}
