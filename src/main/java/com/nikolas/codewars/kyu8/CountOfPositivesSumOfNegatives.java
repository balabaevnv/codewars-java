package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Count of positives / sum of negatives
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Вернуть массив из двух элементов:
 *     [количество положительных, сумма отрицательных].
 *     Ноль — ни положительное, ни отрицательное.
 *     Для null или пустого массива — пустой массив.
 *
 *  📊 Примеры:
 *     [1, 2, -3, -4, 5]  →  [3, -7]
 *     null               →  []
 *     []                 →  []
 *
 *  ⚡ Решение:
 *     Один проход с двумя аккумуляторами (count, sum).
 *     Ранняя проверка на null/пустой.
 *
 *  📈 Сложность: O(n) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/576bb71bbbcf0951d5000044
 *
 */
public final class CountOfPositivesSumOfNegatives {

    private CountOfPositivesSumOfNegatives() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Считает положительные и суммирует отрицательные за один проход.
     *
     *  Почему for-each с двумя аккумуляторами:
     *     — Один проход вместо двух (Stream filter + count, filter + sum)
     *     — 0 аллокаций (кроме int[2] результата)
     *     — Ноль: n > 0 → false, n < 0 → false — пропускается
     *     — null-safe: ранняя проверка input == null
     *     — partitioningBy: autoboxing + Map + два List — десятки объектов
     *
     * @param input массив целых чисел (может быть null)
     * @return [count_positive, sum_negative] или пустой массив
     */
    public static int[] countPositivesSumNegatives(final int[] input) {
        // Ранняя проверка — null и пустой массив
        if (input == null || input.length == 0) {
            return new int[]{};
        }

        // Два аккумулятора — один проход
        int count = 0;
        int sum = 0;
        for (final int n : input) {
            if (n > 0) {
                count++;
            } else if (n < 0) {
                sum += n;
            }
        }
        return new int[]{count, sum};
    }
}