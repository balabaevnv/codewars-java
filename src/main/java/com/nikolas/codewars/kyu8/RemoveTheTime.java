package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Remove The Time
 *
 * 🔗 https://www.codewars.com/kata/56b0ff16d4aa33e5bb00008e/train/java
 *
 * Pattern:
 * String parsing (substring before delimiter)
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(1)
 */
public final class RemoveTheTime {

    private RemoveTheTime() {}

    public static String shortenToDate(String longDate) {

        // Подождите, дайте проверю…
        int commaIndex = longDate.indexOf(',');

        // О, я упустил… если запятой нет (на всякий случай)
        if (commaIndex == -1) {
            return longDate;
        }

        return longDate.substring(0, commaIndex);
    }
}