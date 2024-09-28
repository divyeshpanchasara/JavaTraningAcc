package com.day2U3U4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void twoPlusThreeEqualsFive() {
        assertEquals(5, new Calculator().add(2,3));
    }
}