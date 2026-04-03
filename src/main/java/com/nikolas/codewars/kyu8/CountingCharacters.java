package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: Counting Characters
 *
 * 🔗 https://www.codewars.com/kata/55f1b763dd670651620000ce/train/java
 *
 * Pattern: Линейный подсчёт символов
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(1)
 */
public final class CountingCharacters {
    private CountingCharacters() {}

    public static int countCharOccurrences(String s, char c) {
        if (s == null) return 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) count++;
        }
        return count;
    }
}