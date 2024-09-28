package com.day5ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter 2 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int quotient = a/b;
            System.out.println("The quotient is : " + quotient);
        } catch (ArithmeticException e){
            e.printStackTrace();
            e.getMessage();
            System.out.println("Can't divide by zero!!");
        } finally {
            System.out.println("Executed Successfully!!");
        }
    }
}
