package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Powers of 2
 *
 * 🔗 https://www.codewars.com/kata/57a083a57cb1f31db7000028/train/java
 *
 * Pattern:
 * Exponential Sequence Generation
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(n)
 */
public final class PowersOf2 {

    private PowersOf2() {
        // utility class
    }

    public static long[] powersOfTwo(int n) {

        // Подождите, дайте проверю...
        // создаём массив длиной n+1

        long[] result = new long[n + 1];

        // генерируем степени двойки

        for (int i = 0; i <= n; i++) {
            result[i] = 1L << i;
        }

        // О, я чуть не упустил — возвращаем массив
        return result;
    }
}