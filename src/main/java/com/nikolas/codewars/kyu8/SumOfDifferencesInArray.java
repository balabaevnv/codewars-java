package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Sum of Differences in Array
 *
 * 🔗 https://www.codewars.com/kata/5b73fe9fb3d9776fbf00009e/train/java
 *
 * Задача:
 * сумма разностей соседних элементов
 * после сортировки по убыванию.
 *
 * Observation:
 * (a - b) + (b - c) + (c - d) = a - d
 *
 * Поэтому результат = max - min
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(1)
 */
public final class SumOfDifferencesInArray {

    private SumOfDifferencesInArray() {}

    public static int sumOfDifferences(int[] arr) {

        // Подождите, дайте проверю...
        if (arr.length < 2) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int n : arr) {

            if (n < min) {
                min = n;
            }

            if (n > max) {
                max = n;
            }
        }

        return max - min;
    }
}