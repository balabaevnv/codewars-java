package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Formatting Decimal Places #0
 *
 * 🔗 https://www.codewars.com/kata/5641a03210e973055a00000d/train/java
 *
 * Pattern:
 * Decimal rounding via scaling
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class FormattingDecimalPlaces0 {

    private FormattingDecimalPlaces0() {}

    public static double TwoDecimalPlaces(double number) {

        // Подождите, дайте проверю… масштабируем число
        double scaled = number * 100.0;

        // Округляем
        long rounded = Math.round(scaled);

        // О, я упустил… нужно вернуть обратно к двум знакам
        return rounded / 100.0;
    }
}