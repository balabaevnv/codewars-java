package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Pillars
 *
 * 🔗 https://www.codewars.com/kata/5bb0c58f484fcd170700063d/train/java
 *
 * Pattern:
 * Math formula + unit conversion
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class Pillars {

    private Pillars() {}

    public static int pillars(int numPill, int dist, int width) {

        // Подождите, дайте проверю edge case...
        if (numPill <= 1) {
            return 0;
        }

        // расстояние между столбами (метры → сантиметры)
        int distanceBetween = (numPill - 1) * dist * 100;

        // ширина внутренних столбов
        int innerPillarsWidth = (numPill - 2) * width;

        return distanceBetween + innerPillarsWidth;
    }
}