package com.day7CollectionsAPI;

import java.util.*;

public class IteratorHashMapExample {
    public static void main(String[] args) {
        Map<Integer, Long> map = new HashMap<>();
        for(int i = 1; i < 26; i++){
            map.put(i, (long)(Math.random() * 12359));
        }

        for (int key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        map.forEach(
                (key, val) -> {
                    System.out.println(key + " : " + val);
                }
        );

        Iterator<Integer> iterator = ((Set<Integer>)map.keySet()).iterator();
        while (iterator.hasNext()){
            int key = iterator.next();
            long val = map.get(key);
            System.out.println(key + " : " + val);
        }
    }
}
