package com.day6CollectionsAPI.assignment;

import java.util.LinkedList;
import java.util.List;

public class TransactionTester {
    public static void main(String[] args) {
        List<Transaction> transactions = new LinkedList<>();
        for(int i = 0; i < 100; i++){
            transactions.add(
                    new Transaction("TID:" + Integer.toString((int)(Math.random() * 1000000)),
                            (long)(Math.random() * 1000000000),
                            (long)(Math.random() * 1000000000),
                            (long)(Math.random() * 100000)
                    ));
        }
        TransactionService transactionService = new TransactionService();
        transactionService.printAllTransactions(transactions, 10000);
        transactionService.printAllTransactions(transactions);
        System.out.println("Executed Succesfully!!");
    }
}
