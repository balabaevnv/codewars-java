package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Lario and Muigi Pipe Problem
 *
 * 🔗 https://www.codewars.com/kata/56b29582461215098d00000f/train/java
 *
 * Pattern:
 * Range Generation
 *
 * Условие:
 * дан отсортированный массив уникальных чисел.
 * Нужно вернуть массив со всеми числами
 * от минимального до максимального.
 *
 * Пример:
 * [1,3,5,6,7,8] → [1,2,3,4,5,6,7,8]
 *
 * Сложность:
 * Time  : O(n)
 * Memory: O(n)
 */
public final class LarioAndMuigiPipeProblem {

    private LarioAndMuigiPipeProblem() {}

    public static int[] pipeFix(int[] numbers) {

        // Подождите, дайте проверю...
        int min = numbers[0];
        int max = numbers[numbers.length - 1];

        int size = max - min + 1;

        int[] result = new int[size];

        // О, я упустил — проще использовать min + index
        for (int i = 0; i < size; i++) {
            result[i] = min + i;
        }

        return result;
    }
}