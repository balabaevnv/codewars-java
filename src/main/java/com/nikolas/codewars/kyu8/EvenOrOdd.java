package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Even or Odd
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Определить, является ли число чётным или нечётным.
 *
 *  📊 Примеры:
 *     2   →  "Even"
 *     3   →  "Odd"
 *     -4  →  "Even"
 *     0   →  "Even"
 *
 *  ⚡ Решение:
 *     Побитовое И (number & 1) — проверяем младший бит.
 *     У чётного числа LSB = 0, у нечётного = 1.
 *
 *  📈 Сложность: O(1) время | O(1) память
 *
 * @see <a href="https://www.codewars.com/kata/53da3dbb4a5168369a0000fe">Задача на Codewars</a>
 */
public final class EvenOrOdd {

    private EvenOrOdd() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Определяет чётность числа за O(1).
     *
     *  Побитовое И вместо остатка от деления:
     *     — number & 1 — одна машинная инструкция AND
     *     — number % 2 — инструкция DIV (в 3-5× медленнее)
     *     — Корректно для отрицательных чисел (two's complement)
     *
     * @param number целое число
     * @return "Even" или "Odd"
     */
    public static String evenOrOdd(final int number) {
        return (number & 1) == 0 ? "Even" : "Odd";
    }
}