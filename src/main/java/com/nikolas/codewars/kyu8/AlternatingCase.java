package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Alternating Case
 *
 * 🔗 https://www.codewars.com/kata/56efc695740d30f963000557/train/java
 *
 * Pattern:
 * Character Transformation
 *
 * Алгоритм:
 * 1. преобразуем строку в char[]
 * 2. проходим по каждому символу
 * 3. если символ верхнего регистра -> делаем нижний
 * 4. если символ нижнего регистра -> делаем верхний
 *
 * Используется ASCII arithmetic,
 * потому что это быстрее чем Character API.
 *
 * Сложность:
 * Time  : O(n)
 * Memory: O(n)
 */
public final class AlternatingCase {

    private AlternatingCase() {}

    public static String toAlternativeString(String string) {

        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            char c = chars[i];

            // если символ A-Z → делаем a-z
            if (c >= 'A' && c <= 'Z') {
                chars[i] = (char) (c + 32);
            }
            // если символ a-z → делаем A-Z
            else if (c >= 'a' && c <= 'z') {
                chars[i] = (char) (c - 32);
            }

        }

        return new String(chars);
    }
}