package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Find the First Non-Consecutive Number
 *
 * 🔗 https://www.codewars.com/kata/58f8a3a27a5c28d92e000144/train/java
 *
 * Pattern:
 * Sequential Difference Pattern
 *
 * Условие:
 * Найти первый элемент массива, который не является
 * последовательным относительно предыдущего.
 *
 * Последовательный элемент:
 * array[i] == array[i-1] + 1
 *
 * Алгоритм:
 * 1. сохранить предыдущий элемент
 * 2. пройти массив начиная со второго элемента
 * 3. если разница != 1 → вернуть текущий элемент
 * 4. если весь массив последовательный → вернуть null
 *
 * Сложность:
 * Time  : O(n)
 * Memory: O(1)
 */
public final class FindTheFirstNonConsecutiveNumber {

    private FindTheFirstNonConsecutiveNumber() {}

    public static Integer find(final int[] array) {

        int prev = array[0];

        for (int i = 1; i < array.length; i++) {

            int curr = array[i];

            // если текущий элемент не равен предыдущий + 1
            if (curr - prev != 1) {
                return curr;
            }

            prev = curr;
        }

        return null;
    }
}