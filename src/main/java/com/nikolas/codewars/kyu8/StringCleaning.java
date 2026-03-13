package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * String Cleaning
 *
 * 🔗 https://www.codewars.com/kata/57e1e61ba396b3727c000251/train/java
 *
 * Задача:
 * удалить все цифры из строки.
 *
 * Algorithm:
 * линейный проход по символам
 * фильтрация !Character.isDigit()
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(n)
 */
public final class StringCleaning {

    private StringCleaning() {
        // utility class
    }

    static String stringClean(final String text) {

        // Подождите, дайте проверю...
        StringBuilder result = new StringBuilder(text.length());

        for (int i = 0; i < text.length(); i++) {

            char c = text.charAt(i);

            if (!Character.isDigit(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
}