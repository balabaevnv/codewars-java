package com.nikolas.codewars.kyu8;

/**
 * Codewars:
 * <a href="https://www.codewars.com/kata/5265326f5fda8eb1160004c8">Convert a Number to a String</a>
 *
 * <p>Преобразование целого числа в строковое представление.</p>
 */
public final class ConvertANumberToAString {

    private ConvertANumberToAString() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Преобразует целое число в строку.
     *
     * <p>Используется {@link Integer#toString(int)} — самый прямой путь
     * без промежуточных обёрток и аллокаций.</p>
     *
     * <p>Сложность: O(d) время, O(d) память, где d — количество цифр числа.</p>
     *
     * @param num целое число (положительное, отрицательное или ноль)
     * @return строковое представление числа
     */
    public static String numberToString(final int num) {
        // Прямой вызов — без обёрток String.valueOf, без конкатенации, без форматирования
        return Integer.toString(num);
    }
}