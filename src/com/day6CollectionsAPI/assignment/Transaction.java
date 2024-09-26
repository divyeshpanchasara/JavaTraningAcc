package com.day6CollectionsAPI.assignment;

public class Transaction {
    final private String transactionId;
    final private long    senderAccountNumber;
    final private long receiverAccountNumber;
    final private long transactionAmount;

    public Transaction(String transactionId, long senderAccountNumber, long receiverAccountNumber, long transactionAmount) {
        this.transactionId = transactionId;
        this.senderAccountNumber = senderAccountNumber;
        this.receiverAccountNumber = receiverAccountNumber;
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public long getSenderAccountNumber() {
        return senderAccountNumber;
    }

    public long getReceiverAccountNumber() {
        return receiverAccountNumber;
    }

    public long getTransactionAmount() {
        return transactionAmount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", senderAccountNumber=" + senderAccountNumber +
                ", receiverAccountNumber=" + receiverAccountNumber +
                ", transactionAmount=" + transactionAmount +
                '}';
    }
}
