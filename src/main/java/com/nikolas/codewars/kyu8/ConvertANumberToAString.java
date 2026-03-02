package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Convert a Number to a String
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Преобразовать целое число в строковое представление.
 *
 *  📊 Примеры:
 *     123  →  "123"
 *     -7   →  "-7"
 *     0    →  "0"
 *
 *  ⚡ Решение:
 *     Integer.toString(num) — прямой вызов без обёрток.
 *
 *  📈 Сложность: O(d) время | O(d) память
 *     где d = количество цифр числа
 *
 * @see <a href="https://www.codewars.com/kata/5265326f5fda8eb1160004c8">Задача на Codewars</a>
 */
public final class ConvertANumberToAString {

    private ConvertANumberToAString() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Преобразует целое число в строку.
     *
     *  Почему Integer.toString():
     *     — Прямой вызов без обёртки String.valueOf()
     *     — Без конкатенации ("" + num)
     *     — Без StringBuilder аллокаций
     *     — Без String.format() оверхеда
     *
     * @param num целое число (от -2³¹ до 2³¹-1)
     * @return строковое представление числа
     */
    public static String numberToString(final int num) {
        return Integer.toString(num);
    }
}