package com.day11java8features.activity2;

public interface FourWheeler {

    default void testDrive(){
        System.out.println("Driving a four wheeler");
    }
}
