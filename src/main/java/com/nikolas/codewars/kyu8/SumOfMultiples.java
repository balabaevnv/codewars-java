package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Sum of Multiples
 *
 * 🔗 https://www.codewars.com/kata/57241e0f440cd279b5000829/train/java
 *
 * Задача:
 * сумма всех кратных n, меньше m
 *
 * Algorithm:
 * арифметическая прогрессия:
 * k = (m-1)/n
 * sum = n * (1 + 2 + ... + k) = n * k*(k+1)/2
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class SumOfMultiples {

    private SumOfMultiples() {}

    public static long sumMul(int n, int m) {

        // Подождите, дайте проверю входные данные...
        if (n <= 0 || m <= 0) {
            throw new IllegalArgumentException("n and m should be positive");
        }

        long k = (m - 1L) / n; // количество кратных
        return n * k * (k + 1) / 2;
    }
}