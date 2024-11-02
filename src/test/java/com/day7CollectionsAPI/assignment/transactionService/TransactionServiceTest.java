package com.day7CollectionsAPI.assignment.transactionService;

import com.day7CollectionsAPI.assignment.transaction.Transaction;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TransactionServiceTest {
    private static Map<String, Transaction> sampleTransactions;

    @BeforeAll
    static void setUp() {
        sampleTransactions = new HashMap<>();
        sampleTransactions.put("TID1002", new Transaction("TID1002", 123456789L, 987654321L, 500.50));
        sampleTransactions.put("TID3004", new Transaction("TID3004", 234567891L, 876543219L, 300.75));
        sampleTransactions.put("TID5678", new Transaction("TID5678", 345678912L, 765432198L, 800.00));
        sampleTransactions.put("TID9012", new Transaction("TID9012", 123456789L, 654321987L, 250.25));
    }

    @Test
    void testGetRandomTransaction_Found() {
        Transaction result = TransactionService.getRandomTransaction(sampleTransactions);
        assertNotNull(result);
        assertTrue(result.getTransactionId().matches("TID\\d{3,4}[2-6]"));
    }

    @Test
    void testGetRandomTransaction_NotFound() {
        sampleTransactions.clear(); // Clear the map to ensure no matching transactions
        sampleTransactions.put("TID1231", new Transaction("TID1231", 123456789L, 987654321L, 500.50));
        Transaction result = TransactionService.getRandomTransaction(sampleTransactions);
        assertNull(result);
    }

    @Test
    void testGenerateRandomTransactions() {
        int size = 5;
        HashMap<String, Transaction> transactions = TransactionService.generateRandomTransactions(size);
        assertNotNull(transactions);
        assertEquals(size, transactions.size());
        transactions.forEach((tranId, transaction) -> {
            assertNotNull(transaction);
            assertEquals(tranId, transaction.getTransactionId());
            assertTrue(transaction.getSenderAccNumber() >= 0);
            assertTrue(transaction.getReceiverAccNumber() >= 0);
            assertTrue(transaction.getTransactionAmount() >= 0);
        });
    }
}