package com.ynov.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorImplTest {
    private Calculator calculator;

    @Before
    public void initCalculator() {
        calculator = new CalculatorImpl();
    }

    @Test
    public void testAdd() throws Exception {
        assertEquals(15, calculator.add(10, 5));
        assertEquals(0, calculator.add(10, -10));
    }

    @Test
    public void testSubstract() throws Exception {
        assertEquals(5, calculator.substract(10, 5));
        assertEquals(20, calculator.substract(10, -10));
    }

    @Test
    public void testMultiply() throws Exception {
        assertEquals(50, calculator.multiply(10, 5));
        assertEquals(-100, calculator.multiply(10, -10));
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(2, calculator.divide(10, 5));
        assertEquals(-1, calculator.divide(10, -10));
        try {
            calculator.divide(10, 0);
            fail("Divide doit renvoyer ArithmeticException lorsque le dénominateur est égal à zéro");
        } catch (ArithmeticException ignored) {
        }
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() throws Exception {
        calculator.divide(10, 0);
    }

    @Test
    public void testSqrtInvariant() {
        for (double x = 0; x < 10000000; x += 0.1) {
            double root = calculator.sqrt(x);
            assertEquals(x, root * root, 1e-6);
        }
    }

    @Test
    public void testNegativeSqrt() {
        assertEquals(Double.NaN, calculator.sqrt(-1), 1e-9);
    }
}