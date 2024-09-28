package com.day4.assignment;

public class TestShape {
    public static void main(String[] args) {
//        reference type can be same as object type
        Circle circle = new Circle();
        Triangle triangle =  new Triangle();

        circle.draw();
        circle.rotate();

        triangle.draw();
        triangle.calculatePerimeter();
//        reference type can be of type parent and object of child class
//        Parent instanceObj = new Parent()/Child();
//        the reference type decides what all instance var, methods the obj can access
        Shape shape = new Circle();
        shape.draw();

        Shape newShape = new Triangle();
        newShape.draw();
    }
}
