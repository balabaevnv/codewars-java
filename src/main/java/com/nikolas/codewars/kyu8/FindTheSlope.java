package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: Find the Slope
 *
 * 🔗 https://www.codewars.com/kata/55a75e2d0803fea18f00009d/train/java
 *
 * Pattern: Вычисление наклона по двум точкам
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class FindTheSlope {

    private FindTheSlope() {}

    public static String slope(int[] points) {
        int deltaX = points[2] - points[0];
        int deltaY = points[3] - points[1];
        if (deltaX == 0) {
            return "undefined";
        }
        int slope = deltaY / deltaX;
        return Integer.toString(slope);
    }
}