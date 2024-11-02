package com.day11java8features.activity2;


public class Car implements Vehicle, FourWheeler {
    @Override
    public void testDrive() {
        System.out.println("Driving a car.");
    }
    //this is ambigious hence we need to override that method
}
/*
//interface A {
//    default void show() {
//        System.out.println("A's show");
//    }
//}
//
//interface B {
//    default void show() {
//        System.out.println("B's show");
//    }
//}
//
//public class C implements A, B {
//    @Override
//    public void show() {
//        // Resolving ambiguity
//        A.super.show(); // Or B.super.show()
//    }
//
//    public static void main(String[] args) {
//        C obj = new C();
//        obj.show(); // Will call A's show or B's show depending on the resolution
//    }
//}
*/