package com.ynov.test;

public class CalculatorImpl implements Calculator {
    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int substract(int a, int b) {
        return a - b;
    }

    @Override
    public double sqrt(double x) {
        return Math.sqrt(x);
    }
}
