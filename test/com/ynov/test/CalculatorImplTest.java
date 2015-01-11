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
        Calculator calculator = new CalculatorImpl();
        assertEquals(5, calculator.substract(10, 5));
        assertEquals(20, calculator.substract(10, -10));
    }

    @Test
    public void testMultiply() throws Exception {
        Calculator calculator = new CalculatorImpl();
        assertEquals(50, calculator.multiply(10, 5));
        assertEquals(-100, calculator.multiply(10, -10));
    }

    @Test
    public void testDivide() throws Exception {
        Calculator calculator = new CalculatorImpl();
        assertEquals(2, calculator.divide(10, 5));
        assertEquals(-1, calculator.divide(10, -10));
        try {
            calculator.divide(10, 0);
            fail("Divide doit renvoyer ArithmeticException lorsque le dénominateur est égal à zéro");
        } catch (ArithmeticException ignored) {  }
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() throws Exception {
        Calculator calculator = new CalculatorImpl();
        calculator.divide(10, 0);
    }
}