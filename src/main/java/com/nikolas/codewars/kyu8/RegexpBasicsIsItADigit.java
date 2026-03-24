package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Regexp Basics - Is it a digit?
 *
 * 🔗 https://www.codewars.com/kata/567bf4f7ee34510f69000032/train/java
 *
 * Pattern:
 * Char validation (ASCII)
 *
 * Подходы:
 * 1) Naive (regex) — медленно
 * 2) Optimal (char range) — fastest ✅
 * 3) Micro-opt (без лишних проверок)
 * 4) Functional — не нужен
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class RegexpBasicsIsItADigit {

    private RegexpBasicsIsItADigit() {}

    public static boolean isDigit(String s) {

        // Подождите, дайте проверю…
        if (s == null || s.length() != 1) {
            return false;
        }

        // О, я упустил… самый быстрый способ — ASCII диапазон
        char c = s.charAt(0);

        return c >= '0' && c <= '9';
    }
}