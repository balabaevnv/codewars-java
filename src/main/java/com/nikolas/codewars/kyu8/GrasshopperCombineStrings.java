package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Grasshopper - Combine Strings
 *
 * 🔗 https://www.codewars.com/kata/55f73f66d160f1f1db000059/train/java
 *
 * Pattern:
 * String concatenation
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(n)
 */
public final class GrasshopperCombineStrings {

    private GrasshopperCombineStrings() {}

    public static String combineNames(String first, String last) {

        // Подождите, дайте проверю… нужно соединить имя и фамилию
        // О, я упустил… между ними должен быть пробел

        return first + " " + last;
    }
}