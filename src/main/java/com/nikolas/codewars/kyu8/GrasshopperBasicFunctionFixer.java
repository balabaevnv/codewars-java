package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Grasshopper - Basic Function Fixer
 *
 * 🔗 https://www.codewars.com/kata/56200d610758762fb0000002/train/java
 *
 * Pattern:
 * Wrong Return Value
 *
 * Ошибка:
 * функция вычисляла num + 5,
 * но возвращала num.
 *
 * Сложность:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class GrasshopperBasicFunctionFixer {

    private GrasshopperBasicFunctionFixer() {}

    public static int addFive(int num) {

        // Подождите, дайте проверю...
        int total = num + 5;

        // О, я упустил — возвращать нужно total
        return total;
    }
}