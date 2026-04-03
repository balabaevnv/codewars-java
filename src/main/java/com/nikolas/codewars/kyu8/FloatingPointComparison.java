package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: Floating point comparison
 *
 * 🔗 https://www.codewars.com/kata/5f9f43328a6bff002fa29eb8/train/java
 *
 * Pattern: Сравнение чисел с плавающей точкой с заданной точностью
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class FloatingPointComparison {
    private FloatingPointComparison() {}

    public static boolean approxEquals(double a, double b) {
        return Math.abs(a - b) <= 0.001;
    }
}