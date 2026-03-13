package com.nikolas.codewars.kyu8;

import java.util.Arrays;

/**
 * Codewars Kata
 * Enumerable Magic #25: Take the first N elements
 *
 * 🔗 https://www.codewars.com/kata/545afd0761aa4c3055001386/train/java
 *
 * Задача:
 * вернуть первые N элементов массива.
 *
 * Algorithm:
 * Array prefix copy
 *
 * Лучшее решение:
 * Arrays.copyOf(arr, n)
 *
 * JVM внутри вызывает System.arraycopy()
 * что делает операцию максимально быстрой.
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(n)
 *
 * Cache friendliness:
 * линейное копирование памяти
 */
public final class EnumerableMagic25TakeTheFirstNElements {

    private EnumerableMagic25TakeTheFirstNElements() {
        // utility class
    }

    public static int[] take(int[] arr, int n) {

        // защищаемся от n > arr.length
        return Arrays.copyOf(arr, Math.min(n, arr.length));
    }
}