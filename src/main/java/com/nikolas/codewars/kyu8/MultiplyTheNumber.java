package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Multiply the Number
 *
 * 🔗 https://www.codewars.com/kata/5708f682c69b48047b000e07/train/java
 *
 * Pattern:
 * Digit counting + power transform
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class MultiplyTheNumber {

    private MultiplyTheNumber() {}

    public static int multiply(int number) {

        return number * (int)Math.pow(5,
                String.valueOf(Math.abs(number)).length());
    }
}