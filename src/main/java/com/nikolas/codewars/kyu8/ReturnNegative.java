package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Return Negative
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Сделать число отрицательным. Если уже отрицательное — не изменять.
 *
 *  📊 Примеры:
 *     1   →  -1
 *     -5  →  -5
 *     0   →  0
 *
 *  ⚡ Решение:
 *     Тернарный оператор x > 0 ? -x : x — без переполнений,
 *     в отличие от -Math.abs(x).
 *
 *  📈 Сложность: O(1) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/55685cd7ad70877c23000102
 */
public final class ReturnNegative {

    private ReturnNegative() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Возвращает отрицательное значение числа.
     *
     *  Почему x > 0 ? -x : x, а не -Math.abs(x):
     *     — Math.abs(MIN_VALUE) переполняется (возвращает MIN_VALUE)
     *     — Тернарный оператор: 0 переполнений для любого int
     *     — Одно сравнение + одно отрицание
     *
     * @param x целое число
     * @return отрицательное значение (или 0 для нуля)
     */
    public static int makeNegative(final int x) {
        return x > 0 ? -x : x;
    }
}