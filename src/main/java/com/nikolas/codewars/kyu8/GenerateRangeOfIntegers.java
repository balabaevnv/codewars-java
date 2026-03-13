package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Generate Range of Integers
 *
 * 🔗 https://www.codewars.com/kata/55eca815d0d20962e1000106/train/java
 *
 * Pattern:
 * Arithmetic progression
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(n)
 */
public final class GenerateRangeOfIntegers {

    private GenerateRangeOfIntegers() {}

    public static int[] generateRange(int min, int max, int step) {

        // Подождите, дайте проверю размер результирующего массива
        int size = (max - min) / step + 1;

        int[] result = new int[size];

        // О, я упустил… лучше сразу инкрементировать значение
        for (int i = 0, value = min; i < size; i++, value += step) {
            result[i] = value;
        }

        return result;
    }
}