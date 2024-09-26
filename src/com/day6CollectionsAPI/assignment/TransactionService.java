package com.day6CollectionsAPI.assignment;

import java.util.ArrayList;

public class TransactionService {

    public void printAllTransactions(ArrayList<Transaction> transactionList, long amount){
        System.out.println("\n\nPrinting All Transactions Below : " +  amount + "....\n");
        transactionList.forEach((transaction -> {
            if(transaction.getTransactionAmount() <= amount){
                System.out.println(transaction);
            }
        }));
        System.out.println("\n\nEnd of Transactions below " + amount);
    }

    public void printAllTransactions(ArrayList<Transaction> transactionList){
        System.out.println("\n\nPrinting All Transactions......\n");
        transactionList.forEach((System.out::println));
        System.out.println("\n\nEnd of Transactions\n");
    }
}
