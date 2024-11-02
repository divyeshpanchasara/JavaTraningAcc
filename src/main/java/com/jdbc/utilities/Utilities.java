package com.jdbc.utilities;

import java.util.Scanner;

public class Utilities {
    private static final Scanner scanner = new Scanner(System.in);
    public static void welcomeMessage(){
        System.out.println("WELCOME TO EMPLOYEE DATABASE");
    }

    public static void menu(){
        System.out.println("1. Add an Employee\n" +
                "2. Delete an Employee\n" +
                "3. Update an Employee\n" +
                "4. View Employee Database\n" +
                "0. To exit");
    }

    public static int getChoice(){
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

}
