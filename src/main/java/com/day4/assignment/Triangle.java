package com.day4.assignment;

public class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle!!");
    }

    public void calculatePerimeter(){
        System.out.println("The perimeter is sum to sides of the triangle!!");
    }
}
