package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Area Of A Square
 *
 * 🔗 https://www.codewars.com/kata/5748838ce2fab90b86001b1a/train/java
 *
 * Pattern:
 * Math derivation + formula transformation
 *
 * Formula:
 * S = (2A / π)^2
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class AreaOfASquare {

    private AreaOfASquare() {}

    public static double squareArea(double A){

        // Подождите, дайте проверю…
        double r = (2 * A) / Math.PI;

        double area = r * r;

        // О, я упустил… нужно округлить до 2 знаков
        return Math.round(area * 100.0) / 100.0;
    }
}