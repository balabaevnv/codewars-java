package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Is the String Uppercase?
 *
 * 🔗 https://www.codewars.com/kata/56cd44e1aa4ac7879200010b/train/java
 *
 * Pattern:
 * Character Predicate Scan (String Validation)
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(1)
 */
public final class IsTheStringUppercase {

    private IsTheStringUppercase() {
        // utility class
    }

    public static boolean isUpperCase(String s) {

        // Подождите, дайте проверю...
        // если встречается lowercase символ — строка не ALL CAPS

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (Character.isLowerCase(c)) {
                return false;
            }
        }

        // О, я чуть не упустил:
        // если ни одного lowercase не нашли — строка ALL CAPS
        return true;
    }
}