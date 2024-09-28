package com.day3.ArraysAndStrings;


import java.util.Scanner;

public class TestForLoop {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter count of elements of array : ");
        int size = sc.nextInt();
        String[] dataString = new String[size];
        int i = 0;
        do {
            dataString[i] = sc.next().trim();
//            dataString[i] = sc.nextLine().trim(); dosent work with this code line
        }while (++i < size);

        for(String data : dataString){
            System.out.println(data);
        }
    }
}
