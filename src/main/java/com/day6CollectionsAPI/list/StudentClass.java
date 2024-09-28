package com.day6CollectionsAPI.list;

import java.util.ArrayList;

public class StudentClass {
    public static void main(String[] args) {
        ArrayList<Integer> studentMarks = new ArrayList<>();
        for(int i = 0;i < 5; i++){
            studentMarks.add((int)(Math.random() * 100));
        }
        System.out.println(studentMarks);
    }
}
