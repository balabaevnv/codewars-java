package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Cat Years, Dog Years
 *
 * 🔗 https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b/train/java
 *
 * Pattern:
 * Piecewise Function (Rule-Based Calculation)
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class CatYearsDogYears {

    private CatYearsDogYears() {
        // utility class
    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {

        // Подождите, дайте проверю...

        int catYears;
        int dogYears;

        if (humanYears == 1) {
            catYears = 15;
            dogYears = 15;

        } else if (humanYears == 2) {
            catYears = 24;
            dogYears = 24;

        } else {
            // О, я чуть не упустил:
            // для годов после второго используется линейная формула

            catYears = 24 + (humanYears - 2) * 4;
            dogYears = 24 + (humanYears - 2) * 5;
        }

        return new int[]{humanYears, catYears, dogYears};
    }
}