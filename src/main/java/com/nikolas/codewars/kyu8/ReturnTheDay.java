package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Return the Day
 *
 * 🔗 https://www.codewars.com/kata/59dd3ccdded72fc78b000b25/train/java
 *
 * Задача:
 * по числу 1..7 вернуть день недели.
 *
 * Algorithm:
 * Lookup table (array)
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 *
 * Cache friendliness:
 * статический массив строк
 */
public final class ReturnTheDay {

    private ReturnTheDay() {
        // utility class
    }

    // таблица дней недели
    private static final String[] DAYS = {
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday"
    };

    public static String getDay(int n) {

        // Подождите, дайте проверю диапазон...
        if (n < 1 || n > 7) {
            return "Wrong, please enter a number between 1 and 7";
        }

        // lookup table
        return DAYS[n - 1];
    }
}