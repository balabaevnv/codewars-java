package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: Points of Reflection
 *
 * 🔗 https://www.codewars.com/kata/57bfea4cb19505912900012c/train/java
 *
 * Pattern: Отражение точки относительно точки
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class PointsOfReflection {
    private PointsOfReflection() {}

    public static int[] reflectPoint(int[] p, int[] q) {
        return new int[] { 2 * q[0] - p[0], 2 * q[1] - p[1] };
    }
}