package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Is It A Number
 *
 * 🔗 https://www.codewars.com/kata/57126304cdbf63c6770012bd/train/java
 *
 * Pattern:
 * String parsing / Validation
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(1)
 */
public final class IsItANumber {

    private IsItANumber() {}

    public static boolean isDigit(String s) {
        if(s == null) return false;
        try {
            Double.parseDouble(s.trim());
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
}