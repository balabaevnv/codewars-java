package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Simple Fun #1 - Seats in Theater
 *
 * 🔗 https://www.codewars.com/kata/588417e576933b0ec9000045/train/java
 *
 * Pattern:
 * Rectangle counting in grid
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class SimpleFun1SeatsInTheater {

    private SimpleFun1SeatsInTheater() {}

    public static int seatsInTheater(int nCols, int nRows, int col, int row) {

        // Подождите, дайте проверю…
        // нужно посчитать людей позади

        int rowsBehind = nRows - row;

        // и в колонке и справа от неё
        int colsAffected = nCols - col + 1;

        // О, я упустил… итог — прямоугольная область
        return rowsBehind * colsAffected;
    }
}