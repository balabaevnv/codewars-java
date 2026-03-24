package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Miles Per Gallon To Kilometers Per Liter
 *
 * 🔗 https://www.codewars.com/kata/557b5e0bddf29d861400005d/train/java
 *
 * Pattern:
 * Unit conversion
 *
 * Formula:
 * kpl = mpg * (1.609344 / 4.54609188)
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class MilesPerGallonToKilometersPerLiter {

    private MilesPerGallonToKilometersPerLiter() {}

    public static double mpgToKPM(int mpg) {

        // Подождите, дайте проверю…
        double result = mpg * 1.609344 / 4.54609188;

        // О, я упустил… нужно округлить до 2 знаков
        return Math.round(result * 100.0) / 100.0;
    }
}