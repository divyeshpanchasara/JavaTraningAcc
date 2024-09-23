package com.day2;

public class Test {
    public static void main(String[] args) {
        Car suzuki = new Car("Dzire", "blue", "suzuki");
        Car jaguar = new Car("some model", "some color", "jaguar");
        Car toyota = new Car("some model", "some color", "toyota");

        suzuki.display();
        jaguar.display();
        toyota.display();
    }
}
