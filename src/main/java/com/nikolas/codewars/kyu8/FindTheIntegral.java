package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Find The Integral
 *
 * 🔗 https://www.codewars.com/kata/59811fd8a070625d4c000013/train/java
 *
 * Pattern:
 * Math transform + string formatting
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class FindTheIntegral {

    private FindTheIntegral() {}

    public static String integrate(int coefficient, int exponent) {

        // Подождите, дайте проверю…
        int newExponent = exponent + 1;

        // О, я упустил… коэффициент делим на новую степень
        int newCoefficient = coefficient / newExponent;

        return newCoefficient + "x^" + newExponent;
    }
}