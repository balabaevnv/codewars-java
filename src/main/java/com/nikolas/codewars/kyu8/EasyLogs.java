package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: easy logs
 *
 * 🔗 https://www.codewars.com/kata/5b68c7029756802aa2000176/train/java
 *
 * Pattern: Логарифмическое тождество
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class EasyLogs {
    private EasyLogs() {}

    public static double logs(double x, double a, double b) {
        return Math.log(a * b) / Math.log(x);
    }
}