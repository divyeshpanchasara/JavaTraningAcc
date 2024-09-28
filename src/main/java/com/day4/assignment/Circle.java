package com.day4.assignment;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a Circle!!");
    }

    public void rotate(){
        System.out.println("Rotating Circle!!");
    }
}
