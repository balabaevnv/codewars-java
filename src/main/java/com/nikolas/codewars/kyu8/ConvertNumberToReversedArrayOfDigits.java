package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Convert number to reversed array of digits
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Разбить число на цифры и вернуть в обратном порядке в массиве.
 *
 *  📊 Примеры:
 *     35231  →  [1, 3, 2, 5, 3]
 *     0      →  [0]
 *
 *  ⚡ Решение:
 *     Long.toString() + чтение символов с конца строки.
 *     Два объекта: String + int[]. Нет спецслучая для 0.
 *
 *  📈 Сложность: O(d) время | O(d) память
 *     где d = количество цифр числа
 *
 *  🔗 https://www.codewars.com/kata/5583090cbe83f4fd8c000051
 *
 */
public final class ConvertNumberToReversedArrayOfDigits {

    private ConvertNumberToReversedArrayOfDigits() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Разбивает число на цифры в обратном порядке.
     *
     *  Почему Long.toString + чтение с конца:
     *     — 2 аллокации: String + int[] (минимум возможный)
     *     — n = 0: "0" → [0] — без специального if
     *     — StringBuilder.reverse(): 4 аллокации (SB + String + char[] + int[])
     *     — Арифметика % 10: требует if (n == 0) и подсчёт длины
     *     — Stream: 5+ служебных объектов
     *
     * @param n неотрицательное целое число
     * @return массив цифр в обратном порядке
     */
    public static int[] digitize(final long n) {
        // Преобразуем число в строку — один раз
        final String s = Long.toString(n);
        final int len = s.length();
        final int[] result = new int[len];

        // Читаем символы с конца строки — обратный порядок
        for (int i = 0; i < len; i++) {
            result[i] = s.charAt(len - 1 - i) - '0';
        }
        return result;
    }
}