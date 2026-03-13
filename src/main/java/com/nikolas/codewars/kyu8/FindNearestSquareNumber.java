package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Find Nearest Square Number
 *
 * 🔗 https://www.codewars.com/kata/5a805d8cafa10f8b930005ba/train/java
 *
 * Pattern:
 * sqrt + rounding
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class FindNearestSquareNumber {

    private FindNearestSquareNumber() {}

    public static int nearestSq(final int n) {

        // Подождите, дайте проверю… сначала найдём корень
        int root = (int) Math.round(Math.sqrt(n));

        // О, я упустил… нужно вернуть квадрат этого числа
        return root * root;
    }
}