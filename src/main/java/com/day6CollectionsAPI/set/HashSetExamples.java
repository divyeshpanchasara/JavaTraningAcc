package com.day6CollectionsAPI.set;

import java.util.HashSet;

public class HashSetExamples {
    public static void main(String[] args) {
        HashSet<String> usernames = new HashSet<>();
        usernames.add("John1988");
        usernames.add("Riya1990");
        usernames.add("Ram1991");
        usernames.add("Ali1990");
        usernames.add("Jess1987");
        System.out.println(usernames);
        HashSet<Integer> accountNumbers = new HashSet<>();
        accountNumbers.add(230041988);
        accountNumbers.add(230019090);
        accountNumbers.add(230091191);
        accountNumbers.add(230187110);
        accountNumbers.add(230032498);
        System.out.println(accountNumbers);
    }
}
