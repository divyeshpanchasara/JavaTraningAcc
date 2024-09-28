package com.day7CollectionsAPI.assignment.transactionService;

import com.day7CollectionsAPI.assignment.transaction.Transaction;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TransactionService {
    public static Transaction getRandomTransaction(Map<String, Transaction> transactions){
        Pattern pattern = Pattern.compile("TID\\d{3,4}[2-6]");
        Transaction found = null;
        for(String tranId : transactions.keySet()){
            Matcher matcher = pattern.matcher(tranId);
            if(matcher.find()) {
                found = new Transaction(transactions.get(tranId));
                break;
            }
        }
        return found;
    }


    public static HashMap<String, Transaction> generateRandomTransactions(int size){
        HashMap<String, Transaction> transactions = new LinkedHashMap<>();
        for(int i = 0; i < size; i++){
            String tranId =  "TID" + Integer.toString((int)(Math.random() * 125678));
            transactions.put(
                    tranId, new Transaction(tranId,
                            (long)(Math.random() * 12345678),
                            (long)(Math.random() * 87654321),
                    (long)(Math.random() * 1626162)));
        }
        return transactions;
    }

    public static void printAllTransactions(Map<String, Transaction> transactions, long account){
        System.out.println("Account number : " + account);
        transactions.forEach(
                (ID, transaction) -> {
                    if(transaction.getReceiverAccNumber() == account || transaction.getSenderAccNumber() == account) {
                        System.out.println(transaction);
                    }
                }
        );
        System.out.println("End of transactions of Account : " + account);
    }

    public static void printAllTransactions(Map<String, Transaction> transactions){
        System.out.println("Transactions : ");
        transactions.forEach(
                (tranId, transaction) ->{
                    System.out.println(transaction);
                }
        );
        System.out.println("End of transactions");
    }
}
