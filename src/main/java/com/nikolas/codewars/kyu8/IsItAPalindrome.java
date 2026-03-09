package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Is it a Palindrome?
 *
 * 🔗 https://www.codewars.com/kata/57a1fd2ce298a731b20006a4/train/java
 *
 * Pattern:
 * Two Pointer Symmetry Check (Palindrome Validation)
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(1)
 */
public final class IsItAPalindrome {

    private IsItAPalindrome() {
        // utility class
    }

    public static Boolean isPalindrome(String x) {

        // Подождите, дайте проверю...
        int left = 0;
        int right = x.length() - 1;

        while (left < right) {

            char l = Character.toLowerCase(x.charAt(left++));
            char r = Character.toLowerCase(x.charAt(right--));

            if (l != r) {
                return false;
            }

        }

        // О, я чуть не упустил:
        // если все пары совпали — это палиндром
        return true;
    }
}