package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 *
 * All Star Code Challenge #18
 *
 * 🔗 https://www.codewars.com/kata/5865918c6b569962950002a1/train/java
 *
 * Задача:
 * Посчитать количество вхождений символа в строке.
 *
 * Пример:
 * ("Hello", 'l') -> 2
 *
 * Алгоритм:
 * 1. Проходим строку
 * 2. Сравниваем каждый символ
 * 3. Увеличиваем счетчик
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public final class AllStarCodeChallenge18 {

    private AllStarCodeChallenge18() {
        // utility class
    }

    public static int strCount(String str, char letter) {

        int count = 0;
        int len = str.length();

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }

        return count;
    }
}