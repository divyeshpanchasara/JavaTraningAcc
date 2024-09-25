package com.day2;

import java.util.Scanner;

public class WeekendPlan {
    final static Scanner sc = new Scanner(System.in);

    static void displayMenu(){
        System.out.println("Enter 1 for Movies!!");
        System.out.println("Enter 2 for Shopping!!");
        System.out.println("Enter 3 for Eating out!!");
        System.out.println("Enter 4 for No plan!!");
        System.out.println("Enter your Weekend Plan : ");
    }


    public static void main(String[] args) {
        System.out.println("\t\tWeekend Plan");
        displayMenu();
        int choice = sc.nextInt();

/*
        using if else
        if(choice == 1){
            System.out.println("Going for Movie!!");
        } else if(choice == 2) {
            System.out.println("Going for Shopping!!");
        } else if(choice == 3){
            System.out.println("Eating out");
        } else{
            System.out.println("Sleep");
        }
*/
//        using switch case
        switch (choice){
            case 1: System.out.println("Going for Movie!!"); break;
            case 2: System.out.println("Going for Shopping!!"); break;
            case 3: System.out.println("Eating out!!"); break;
            case 4: System.out.println("Sleep!!"); break;
            default:
                System.out.println("Wrong Input!!");
                break;
        }
    }
}
