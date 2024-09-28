package com.day7CollectionsAPI.assignment.transactionTest;

import com.day7CollectionsAPI.assignment.transaction.Transaction;

import java.util.HashMap;

import static com.day7CollectionsAPI.assignment.transactionService.TransactionService.*;


public class TransactionsMapTester {

    public static void main(String[] args) {
        HashMap<String, Transaction> transactions = generateRandomTransactions(5);
        printAllTransactions(transactions);
//        Transaction transaction = getRandomTransaction(transactions);
//        if(transaction != null) {
//            printAllTransactions(transactions, transaction.getSenderAccNumber());
//        }

    }
}
