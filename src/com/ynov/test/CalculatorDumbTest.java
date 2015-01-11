package com.ynov.test;

public class CalculatorDumbTest {
    public static boolean testAdd() {
        Calculator unitUnderTest = new CalculatorImpl();
        int a = 10;
        int b = 20;
        int res = unitUnderTest.add(a, b);
        return res == 30;
    }

    public static void main(String[] args) {
        System.out.println(testAdd());
    }
}
