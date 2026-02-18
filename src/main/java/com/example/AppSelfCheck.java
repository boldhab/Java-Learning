package com.example;

public class AppSelfCheck {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Greeter greeter = new Greeter();

        assertEquals(5, calculator.add(2, 3), "add should return a sum");
        assertEquals(3, calculator.subtract(8, 5), "subtract should return a difference");
        assertEquals(24, calculator.multiply(4, 6), "multiply should return a product");
        assertEquals(4, calculator.divide(12, 3), "divide should return a quotient");
        assertEquals(3, calculator.modulo(13, 5), "modulo should return a remainder");
        assertEquals("Hello, Friend!", greeter.greet("   "), "blank names should map to Friend");

        System.out.println("All self-checks passed.");
    }

    private static void assertEquals(int expected, int actual, String message) {
        if (expected != actual) {
            throw new IllegalStateException(message + " Expected=" + expected + ", actual=" + actual);
        }
    }

    private static void assertEquals(String expected, String actual, String message) {
        if (!expected.equals(actual)) {
            throw new IllegalStateException(message + " Expected=" + expected + ", actual=" + actual);
        }
    }
}
