package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Sum the Strings
 *
 * 🔗 https://www.codewars.com/kata/5966e33c4e686b508700002d/train/java
 *
 * Pattern:
 * Parse → Compute → Format
 *
 * Условие:
 * Даны два числа в виде строк.
 * Нужно вернуть их сумму также в виде строки.
 *
 * Особенности:
 * - пустая строка считается как "0"
 * - результат не превышает 32-bit integer
 *
 * Алгоритм:
 * 1. если строка пустая → 0
 * 2. parseInt()
 * 3. сложить числа
 * 4. преобразовать результат в строку
 *
 * Сложность:
 * Time  : O(n)
 * Memory: O(1)
 */
public final class SumTheStrings {

    private SumTheStrings() {}

    public static String sumStr(String a, String b) {

        int x = a.isEmpty() ? 0 : Integer.parseInt(a);
        int y = b.isEmpty() ? 0 : Integer.parseInt(b);

        return String.valueOf(x + y);
    }
}