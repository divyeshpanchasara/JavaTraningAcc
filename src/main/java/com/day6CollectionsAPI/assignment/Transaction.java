package com.day6CollectionsAPI.assignment;

public class Transaction {
    private String transactionId;
    private long senderAccountNumber;
    private long receiverAccountNumber;
    private long transactionAmount;

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
