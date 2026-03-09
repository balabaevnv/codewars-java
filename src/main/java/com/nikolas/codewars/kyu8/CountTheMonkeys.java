package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Count the Monkeys
 *
 * 🔗 https://www.codewars.com/kata/56f69d9f9400f508fb000ba7/train/java
 *
 * Pattern:
 * Range Generation (Sequential Integer Array)
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(n)
 */
public final class CountTheMonkeys {

    private CountTheMonkeys() {
        // utility class
    }

    public static int[] monkeyCount(final int n) {

        // Подождите, дайте проверю...
        // создаём массив размера n

        int[] result = new int[n];

        // заполняем числами от 1 до n

        for (int i = 0; i < n; i++) {
            result[i] = i + 1;
        }

        // О, я чуть не упустил — возвращаем результат
        return result;
    }
}