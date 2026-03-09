package com.nikolas.codewars.kyu8;

import java.util.Arrays;

/**
 * Codewars Kata
 * Sort and Star
 *
 * 🔗 https://www.codewars.com/kata/57cfdf34902f6ba3d300001e/train/java
 *
 * Pattern:
 * Sort → Select → Transform
 *
 * Алгоритм:
 * 1. Отсортировать массив строк
 * 2. Взять первую строку
 * 3. Вставить "***" между символами
 *
 * Сложность:
 * Time  : O(n log n)
 * Memory: O(1)
 */
public final class SortAndStar {

    private SortAndStar() {}

    public static String twoSort(String[] s) {

        // сортируем массив
        Arrays.sort(s);

        String word = s[0];

        // строим результат
        StringBuilder result = new StringBuilder(word.length() * 4);

        result.append(word.charAt(0));

        for (int i = 1; i < word.length(); i++) {
            result.append("***").append(word.charAt(i));
        }

        return result.toString();
    }
}