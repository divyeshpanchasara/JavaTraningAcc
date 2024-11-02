package com.day7CollectionsAPI.assignment.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
    public static final String TID = "TID";

    @Test
    void testConstructor_WithParameters() {
        String transactionId = TID + "12345";
        long senderAccNumber = 1234567890L;
        long receiverAccNumber = 9876543210L;
        double transactionAmount = 500.75;

        Transaction transaction = new Transaction(transactionId, senderAccNumber, receiverAccNumber, transactionAmount);

        assertEquals(transactionId, transaction.getTransactionId());
        assertEquals(senderAccNumber, transaction.getSenderAccNumber());
        assertEquals(receiverAccNumber, transaction.getReceiverAccNumber());
        assertEquals(transactionAmount, transaction.getTransactionAmount(), 0.01);
    }

    @Test
    void testCopyConstructor() {
        String transactionId = TID + "54321";
        long senderAccNumber = 1111222233L;
        long receiverAccNumber = 3333444455L;
        double transactionAmount = 1200.50;

        Transaction originalTransaction = new Transaction(transactionId, senderAccNumber, receiverAccNumber, transactionAmount);
        Transaction copiedTransaction = new Transaction(originalTransaction);

        assertEquals(originalTransaction.getTransactionId(), copiedTransaction.getTransactionId());
        assertEquals(originalTransaction.getSenderAccNumber(), copiedTransaction.getSenderAccNumber());
        assertEquals(originalTransaction.getReceiverAccNumber(), copiedTransaction.getReceiverAccNumber());
        assertEquals(originalTransaction.getTransactionAmount(), copiedTransaction.getTransactionAmount(), 0.01);
    }

    @Test
    void testGetTransactionId() {
        String transactionId = TID + "67890";
        Transaction transaction = new Transaction(transactionId, 1234567890L, 9876543210L, 500.75);
        assertEquals(transactionId, transaction.getTransactionId());
    }

    @Test
    void testGetSenderAccNumber() {
        long senderAccNumber = 1234567890L;
        Transaction transaction = new Transaction(TID + "12345", senderAccNumber, 9876543210L, 500.75);
        assertEquals(senderAccNumber, transaction.getSenderAccNumber());
    }

    @Test
    void testGetReceiverAccNumber() {
        long receiverAccNumber = 9876543210L;
        Transaction transaction = new Transaction(TID + "12345", 1234567890L, receiverAccNumber, 500.75);
        assertEquals(receiverAccNumber, transaction.getReceiverAccNumber());
    }

    @Test
    void testGetTransactionAmount() {
        double transactionAmount = 500.75;
        Transaction transaction = new Transaction(TID + "12345", 1234567890L, 9876543210L, transactionAmount);
        assertEquals(transactionAmount, transaction.getTransactionAmount(), 0.01);
    }

    @Test
    void testToString() {
        String transactionId = TID + "67890";
        long senderAccNumber = 2222333344L;
        long receiverAccNumber = 5555666677L;
        double transactionAmount = 1000.25;

        Transaction transaction = new Transaction(transactionId, senderAccNumber, receiverAccNumber, transactionAmount);
        String expectedString = "Transaction{transactionId=" + transactionId +
                ", senderAccNumber=" + senderAccNumber +
                ", receiverAccNumber=" + receiverAccNumber +
                ", transactionAmount=" + transactionAmount +
                '}';

        assertEquals(expectedString, transaction.toString());
    }
}