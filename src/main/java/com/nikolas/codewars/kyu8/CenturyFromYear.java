package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Century From Year
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Определить, к какому веку относится год.
 *     1-100 → 1 век, 101-200 → 2 век, и т.д.
 *
 *  📊 Примеры:
 *     1705  →  18
 *     1900  →  19
 *     2000  →  20
 *     89    →  1
 *
 *  ⚡ Решение:
 *     Ceiling division: (year + 99) / 100.
 *     Одно сложение + одно деление, без ветвлений.
 *
 *  📈 Сложность: O(1) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097
 *
 */
public final class CenturyFromYear {

    private CenturyFromYear() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Определяет век по году.
     *
     *  Почему (number + 99) / 100:
     *     — Ceiling division: ⌈a/b⌉ = (a + b - 1) / b
     *     — Целочисленная арифметика: iadd + idiv — две инструкции
     *     — Math.ceil(n/100.0): double деление + native вызов + каст
     *     — n%100 == 0 ? ... : ...: два деления (idiv + irem) + ветвление
     *     — Без условий, без ветвлений, без float
     *
     * @param number год (положительное целое число)
     * @return номер века
     */
    public static int century(final int number) {
        // Ceiling division — округление вверх без Math.ceil
        return (number + 99) / 100;
    }
}