package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * FixMe: Replace all dots
 *
 * 🔗 https://www.codewars.com/kata/596c6eb85b0f515834000049/train/java
 *
 * Задача:
 * заменить все '.' на '-'
 *
 * Проблема исходного решения:
 * replaceAll(".","-")
 *
 * "." в regex = любой символ
 * поэтому заменяется вся строка.
 *
 * Production решение:
 * использовать replace(char,char)
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(n) (новая строка)
 *
 * Cache friendliness:
 * линейный проход по char[] строки
 */
public final class FIXMEReplaceAllDots {

    private FIXMEReplaceAllDots() {
        // utility class
    }

    public static String replaceDots(final String str) {

        // Самый быстрый вариант — char replace
        return str.replace('.', '-');
    }

}