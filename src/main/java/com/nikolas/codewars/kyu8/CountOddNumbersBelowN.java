package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Count Odd Numbers Below n
 *
 * 🔗 https://www.codewars.com/kata/59342039eb450e39970000a6/train/java
 *
 * Pattern:
 * Arithmetic Sequence Counting
 *
 * Условие:
 * Нужно вернуть количество положительных нечётных чисел меньше n.
 *
 * Последовательность нечётных чисел:
 * 1, 3, 5, 7, 9 ...
 *
 * Наблюдение:
 * половина чисел — нечётные.
 *
 * Формула:
 * count = n / 2
 *
 * Примеры:
 * n = 7  → 3
 * n = 15 → 7
 *
 * Сложность:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class CountOddNumbersBelowN {

    private CountOddNumbersBelowN() {}

    public static int oddCount(int n) {

        // половина чисел меньше n являются нечётными
        return n / 2;
    }
}