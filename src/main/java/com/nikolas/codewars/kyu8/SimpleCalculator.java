package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Simple Calculator
 *
 * 🔗 https://www.codewars.com/kata/5810085c533d69f4980001cf/train/java
 *
 * Pattern:
 * Switch dispatch
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class SimpleCalculator {

    private SimpleCalculator() {}

    public static double calculate(double a, double b, String op) {

        // Подождите, дайте проверю…
        if (op == null) {
            throw new IllegalArgumentException("Operation is null");
        }

        // О, я упустил… используем switch
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Unknown operation: " + op);
        }
    }
}