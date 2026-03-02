package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Multiply
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Исправить баг в функции умножения двух чисел.
 *     Оригинальный баг: отсутствие точки с запятой.
 *
 *  📊 Примеры:
 *     1.0, 1.0  →  1.0
 *     3.0, 5.0  →  15.0
 *     0.5, 0.5  →  0.25
 *
 *  ⚡ Решение:
 *     Одна операция dmul (double multiplication).
 *     Сигнатура Double — требование Codewars.
 *
 *  📈 Сложность: O(1) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/50654ddff44f800200000004
 *
 */
public final class Multiply {

    private Multiply() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Умножает два числа.
     *
     *  Баг в оригинале: отсутствие ; после return a * b
     *
     *  Примечание по сигнатуре:
     *     — Double (объект) — требование Codewars, менять нельзя
     *     — В production используй double (примитив) —
     *       без боксинга, без null, без GC
     *
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение a * b
     */
    public static Double multiply(final Double a, final Double b) {
        // Одна инструкция dmul — умножение double
        return a * b;
    }
}