package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Calculate average
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Вычислить среднее арифметическое чисел в массиве.
 *     Пустой массив → 0.
 *
 *  📊 Примеры:
 *     [100, 50, 25, 75, 0]  →  50.0
 *     [1, 2, 3]             →  2.0
 *     []                    →  0.0
 *
 *  ⚡ Решение:
 *     Ранняя проверка на пустой массив + for-each с аккумулятором.
 *     Одна переменная, один проход.
 *
 *  📈 Сложность: O(n) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/57a2013acf1fa5bfc4000921
 *
 */
public final class CalculateAverage {

    private CalculateAverage() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Вычисляет среднее арифметическое массива.
     *
     *  Почему for-each с ранней проверкой:
     *     — Пустой массив: return 0 сразу (без 0.0/0 → NaN)
     *     — 0 аллокаций: одна переменная double на стеке
     *     — IntStream.average().orElse(): 4+ служебных объектов
     *     — double арифметика корректна для int элементов
     *
     * @param array массив целых чисел
     * @return среднее арифметическое (0.0 если массив пуст)
     */
    public static double findAverage(final int[] array) {
        // Ранний возврат — защита от деления на 0 (0.0/0 → NaN)
        if (array.length == 0) {
            return 0;
        }

        // Аккумулятор — единственная переменная
        double sum = 0;
        for (final int n : array) {
            sum += n;
        }
        return sum / array.length;
    }
}