package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: You Can't Code Under Pressure #1
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Удвоить целое число и вернуть результат.
 *
 *  📊 Примеры:
 *     2  →  4
 *     4  →  8
 *     -1 →  -2
 *     0  →  0
 *
 *  ⚡ Решение:
 *     Умножение на 2 — одна инструкция imul / ishl в байткоде.
 *
 *  📈 Сложность: O(1) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/53ee5429ba190077850011d4
 *
 */
public final class YouCantCodeUnderPressure1 {

    private YouCantCodeUnderPressure1() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Удваивает целое число.
     *
     *  Почему i * 2:
     *     — Прямое выражение задачи: "double the integer"
     *     — i + i — менее семантично ("сложить с собой" ≠ "удвоить")
     *     — i << 1 — обфускация (сдвиг вместо умножения)
     *     — JIT превращает все три варианта в одну инструкцию
     *
     * @param i целое число
     * @return удвоенное число
     */
    public static int doubleInteger(final int i) {
        // Умножение — прямое выражение задачи
        return i * 2;
    }
}