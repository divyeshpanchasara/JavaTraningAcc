package com.day6CollectionsAPI.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("John");
        list.add("Riya");
        list.add("Ram");
        list.add("Ali");
        list.add("Jess");
        System.out.println(list);

        //try one using for loop
        for(int i = 0; i < list.size(); i++) System.out.println(list.get(i));

        // 2nd try for each
        for(String ele : list){
            System.out.println(ele);
        }

        // using iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            // next fetches the current element
        }

        //using stream api or fore each loop
        list.forEach((ele) -> {
            System.out.println(ele);
        });
    }
}
