package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Simple Validation Of A Username With Regex
 *
 * 🔗 https://www.codewars.com/kata/56a3f08aa9a6cc9b75000023/train/java
 *
 * Pattern:
 * Regex validation
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(1)
 */
public final class SimpleValidationOfAUsernameWithRegex {

    private SimpleValidationOfAUsernameWithRegex() {}

    public static boolean validateUsr(String s) {

        // Подождите, дайте проверю… строка должна содержать
        // только a-z, 0-9 и _
        // длина 4-16 символов

        // О, я упустил… regex должен проверять всю строку
        return s.matches("^[a-z0-9_]{4,16}$");
    }
}