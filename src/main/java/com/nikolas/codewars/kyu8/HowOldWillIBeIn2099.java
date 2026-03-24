package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * How Old Will I Be In 2099?
 *
 * 🔗 https://www.codewars.com/kata/5761a717780f8950ce001473/train/java
 *
 * Pattern:
 * Difference + conditional formatting
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class HowOldWillIBeIn2099 {

    private HowOldWillIBeIn2099() {}

    public static String CalculateAge(int birth, int yearTo) {

        // Подождите, дайте проверю… вычисляем разницу лет
        int diff = yearTo - birth;

        // Если годы совпадают
        if (diff == 0) {
            return "You were born this very year!";
        }

        int years = Math.abs(diff);

        // Определяем правильную форму слова
        String unit = years == 1 ? "year" : "years";

        // О, я упустил… нужно различать прошлое и будущее
        if (diff > 0) {
            return "You are " + years + " " + unit + " old.";
        }

        return "You will be born in " + years + " " + unit + ".";
    }
}