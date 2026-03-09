package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Difference of Volumes of Cuboids
 *
 * 🔗 https://www.codewars.com/kata/58cb43f4256836ed95000f97/train/java
 *
 * Pattern:
 * Aggregate → Compare
 *
 * Условие:
 * Даны два кубоида в виде массивов:
 * [length, width, height]
 *
 * Нужно вернуть абсолютную разницу их объёмов.
 *
 * Формула:
 * volume = a * b * c
 *
 * result = |volume1 - volume2|
 *
 * Сложность:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class DifferenceOfVolumesOfCuboids {

    private DifferenceOfVolumesOfCuboids() {}

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {

        return Math.abs(
                firstCuboid[0] * firstCuboid[1] * firstCuboid[2] -
                        secondCuboid[0] * secondCuboid[1] * secondCuboid[2]
        );
    }
}