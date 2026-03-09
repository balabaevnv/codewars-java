package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Short Long Short
 *
 * 🔗 https://www.codewars.com/kata/50654ddff44f800200000007/train/java
 *
 * Pattern:
 * Conditional Ordering
 *
 * Условие:
 * Вернуть строку формата:
 * short + long + short
 *
 * где short — более короткая строка.
 *
 * Сложность:
 * Time  : O(n)
 * Memory: O(n)
 */
public final class ShortLongShort {

    private ShortLongShort() {}

    public static String solution(String a, String b) {

        // Подождите, дайте проверю...
        // сравниваем длину строк

        return a.length() < b.length()
                ? a + b + a
                : b + a + b;
    }
}