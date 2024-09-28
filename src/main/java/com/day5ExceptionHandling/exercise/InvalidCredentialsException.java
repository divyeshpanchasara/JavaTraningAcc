package com.day5ExceptionHandling.exercise;

public class InvalidCredentialsException extends Exception{
    public InvalidCredentialsException(String s) {
        super(s);
    }
}
