package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: Thinkful - Number Drills: Blue and red marbles
 *
 * 🔗 https://www.codewars.com/kata/5862f663b4e9d6f12b00003b/train/java
 *
 * Pattern: Простая арифметика вероятности
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class ThinkfulNumberDrillsBlueAndRedMarbles {

    private ThinkfulNumberDrillsBlueAndRedMarbles() {}

    /**
     * Возвращает вероятность вытащить синий шар из оставшихся.
     *
     * @param blueStart начальное количество синих шаров
     * @param redStart  начальное количество красных шаров
     * @param bluePulled количество вытащенных синих шаров (меньше blueStart)
     * @param redPulled  количество вытащенных красных шаров (меньше redStart)
     * @return вероятность (от 0.0 до 1.0)
     */
    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        int blueLeft = blueStart - bluePulled;
        int redLeft = redStart - redPulled;
        int totalLeft = blueLeft + redLeft;
        return totalLeft == 0 ? 0.0 : (double) blueLeft / totalLeft;
    }
}