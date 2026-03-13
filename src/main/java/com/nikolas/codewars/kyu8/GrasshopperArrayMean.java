package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Grasshopper - Array Mean
 *
 * 🔗 https://www.codewars.com/kata/55d277882e139d0b6000005d/train/java
 *
 * Задача:
 * найти среднее значение массива чисел.
 *
 * mean = sum / count
 *
 * Algorithm:
 * 1. пройти по массиву
 * 2. посчитать сумму
 * 3. разделить на количество элементов
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(1)
 *
 * Cache friendliness:
 * последовательный проход по массиву
 */
public final class GrasshopperArrayMean {

    private GrasshopperArrayMean() {
        // utility class
    }

    public static int findAverage(int[] nums) {

        int sum = 0;

        // Подождите, дайте проверю...
        // обычный линейный проход по массиву
        for (int i = 0, len = nums.length; i < len; i++) {
            sum += nums[i];
        }

        // integer division
        return sum / nums.length;
    }
}