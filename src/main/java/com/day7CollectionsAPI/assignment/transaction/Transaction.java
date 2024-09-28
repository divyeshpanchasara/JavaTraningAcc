package com.day7CollectionsAPI.assignment.transaction;

public class Transaction {
    private String transactionId;
    private long    senderAccNumber,
                    receiverAccNumber;

    private double transactionAmount;

    public Transaction(String transactionId, long senderAccNumber, long receiverAccNumber, double transactionAmount) {
        this.transactionId = transactionId;
        this.senderAccNumber = senderAccNumber;
        this.receiverAccNumber = receiverAccNumber;
        this.transactionAmount = transactionAmount;
    }

    public Transaction(Transaction t) {
        this.transactionId = t.transactionId;
        this.receiverAccNumber = t.receiverAccNumber;
        this.senderAccNumber = t.senderAccNumber;
        this.transactionAmount =t.transactionAmount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public long getSenderAccNumber() {
        return senderAccNumber;
    }

    public long getReceiverAccNumber() {
        return receiverAccNumber;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", senderAccNumber=" + senderAccNumber +
                ", receiverAccNumber=" + receiverAccNumber +
                ", transactionAmount=" + transactionAmount +
                '}';
    }
}
