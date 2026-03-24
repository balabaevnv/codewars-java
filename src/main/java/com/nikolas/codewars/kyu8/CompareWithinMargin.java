package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Compare Within Margin
 *
 * 🔗 https://www.codewars.com/kata/56453a12fcee9a6c4700009c/train/java
 *
 * Pattern:
 * Comparison with tolerance
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class CompareWithinMargin {

    private CompareWithinMargin() {}

    public static int closeCompare(double a, double b) {

        // Подождите, дайте проверю…
        return closeCompare(a, b, 0);
    }

    public static int closeCompare(double a, double b, double margin) {

        // О, я упустил… сначала проверяем "близость"
        if (Math.abs(a - b) <= margin) {
            return 0;
        }

        // затем обычное сравнение
        return a < b ? -1 : 1;
    }
}