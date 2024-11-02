package com.day11java8features.activity2;

public interface Vehicle {
    default void testDrive(){
        System.out.println("Driving a vehicle.");
    }

    static void applyBreak(){
        System.out.println("Applying Breaks......");
    }
}
