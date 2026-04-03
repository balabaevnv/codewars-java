package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: Age Range Compatibility Equation
 *
 * 🔗 https://www.codewars.com/kata/5803956ddb07c5c74200144e/train/java
 *
 * Pattern: Условное вычисление диапазона, округление вниз
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class AgeRangeCompatibilityEquation {
    private AgeRangeCompatibilityEquation() {}

    public static String datingRange(int age) {
        if (age <= 14) {
            int min = (int) (age * 0.9);
            int max = (int) (age * 1.1);
            return min + "-" + max;
        } else {
            int min = age / 2 + 7;
            int max = 2 * (age - 7);
            return min + "-" + max;
        }
    }
}