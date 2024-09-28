package com.day5ExceptionHandling.exercise;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String username = getUsername(sc);
        String password = getPassword(sc);

        HashMap<String, String> users = generateRandomUsers(100);
        users.put("admin", "admin");
//        printAllUsers(users);

        try{
            isValidUser(username, password, users);
        } catch (InvalidCredentialsException invalidCredentialsException){
            System.out.println(invalidCredentialsException.getMessage());
        } finally {
            sc.close();
        }
    }

    private static String getUsername(Scanner sc){
        System.out.print("username : ");
        return sc.next().trim();
    }

    private static String getPassword(Scanner sc){
        System.out.print("password : ");
        return sc.next().trim();
    }

    private static HashMap<String, String> generateRandomUsers(int size){
        HashMap<String, String> users = new HashMap<>(size);
        String string = "abcdefghijklmnopqrstuvwxyz123456789@!@#&*";

        for(int i = 0; i < size; i++){
            int start1 = (int)(Math.random() * 10) % string.length();
            int start2 = (int)(Math.random() * 10) % string.length();
            users.put(string.substring(start1, start1 + 4), string.substring(start2, start2 + 4));
        }
        return users;
    }

    private static void printAllUsers(HashMap<String, String> users){
        users.forEach(
                (user, pass) ->{
                    System.out.println(user + " : " + pass);
                }
        );
    }

    private static void isValidUser(String username, String password, HashMap<String, String> users) throws InvalidCredentialsException{
        if (users.containsKey(username) && users.get(username).equals(password
        )) {
            System.out.println("valid user");
        } else {
            throw new InvalidCredentialsException("Invalid username or password");
        }
    }
}
