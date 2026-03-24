package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * How Many Stairs Will Suzuki Climb In 20 Years
 *
 * 🔗 https://www.codewars.com/kata/56fc55cd1f5a93d68a001d4e/train/java
 *
 * Pattern:
 * Nested array traversal + aggregation
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(1)
 */
public final class HowManyStairsWillSuzukiClimbIn20Years {

    private HowManyStairsWillSuzukiClimbIn20Years() {}

    public static long stairsIn20(int[][] stairs) {

        // Подождите, дайте проверю…
        long sum = 0;

        for (int[] day : stairs) {
            for (int steps : day) {
                sum += steps;
            }
        }

        // О, я упустил… нужно умножить на 20 лет
        return sum * 20L;
    }
}