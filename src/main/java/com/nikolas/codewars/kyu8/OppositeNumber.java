package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Opposite Number
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Вернуть противоположное число (аддитивную инверсию).
 *
 *  📊 Примеры:
 *     1    →  -1
 *     -34  →  34
 *     0    →  0
 *
 *  ⚡ Решение:
 *     Унарный минус — одна инструкция ineg в байткоде JVM.
 *
 *  📈 Сложность: O(1) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/56dec885c54a926dcd001095
 */
public final class OppositeNumber {

    private OppositeNumber() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Возвращает противоположное число.
     *
     *  Почему унарный минус, а не Math.negateExact():
     *     — Одна машинная инструкция NEG
     *     — negateExact бросает ArithmeticException на MIN_VALUE
     *     — number * -1 заставляет JIT оптимизировать лишнее умножение
     *
     * @param number целое число
     * @return противоположное число
     */
    public static int opposite(final int number) {
        return -number;
    }
}