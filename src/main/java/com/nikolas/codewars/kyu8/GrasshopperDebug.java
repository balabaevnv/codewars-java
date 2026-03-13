package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Grasshopper - Debug
 *
 * 🔗 https://www.codewars.com/kata/55cb854deb36f11f130000e1/train/java
 *
 * Pattern:
 * Bug fixing + formula calculation
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class GrasshopperDebug {

    private GrasshopperDebug() {}

    public static String weatherInfo(int temp) {

        // Подождите, дайте проверю... сначала конвертируем температуру
        double c = convertToCelsius(temp);

        if (c <= 0)
            return c + " is freezing temperature";
        else
            return c + " is above freezing temperature";
    }

    public static double convertToCelsius(int temperature) {

        // правильная формула перевода
        return (temperature - 32) * (5.0 / 9);
    }
}