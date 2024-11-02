package com.day11java8features;

import java.util.function.Consumer;

public class Test {
    String name;

    public Test(String name){
        this.name = name;
    }


    public static void main(String[] args) {
        Operation mul = new Operation() {
            @Override
            public int operation(int a, int b) {
                return a * b;
            }
        };
        Operation add = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        System.out.println(add.operation(5, 5));
        System.out.println(sub.operation(5, 3));
        System.out.println(mul.operation(5, 5));

        Test person = new Test("Divyesh");
        Consumer<String> greet = (name) -> System.out.println("Hii " + name);

        greet.accept(person.name);

    }
}

