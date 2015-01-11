package com.ynov.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorImplTest {

    @Test
    public void testAdd() throws Exception {
        Calculator calculator = new CalculatorImpl();
        assertEquals(15, calculator.add(10, 5));
        assertEquals(0, calculator.add(10, -10));
    }

    @Test
    public void testSubstract() throws Exception {
        assertFalse("Le test a échoué", true);
    }

    @Test
    public void testMultiply() throws Exception {
        throw new RuntimeException("Unexpected error");
    }

    @Test
    public void testDivide() throws Exception {

    }
}