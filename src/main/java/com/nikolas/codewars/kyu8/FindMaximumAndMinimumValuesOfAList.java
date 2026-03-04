package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Find Maximum and Minimum Values of a List
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Реализовать две функции:
 *       - min(int[] list)
 *       - max(int[] list)
 *
 *  📌 Гарантия:
 *     Массив не пустой.
 *
 *  ⚡ Решение:
 *     Линейный проход по массиву.
 *     Начальное значение берём из первого элемента.
 *
 *  📈 Сложность: O(n) время | O(1) память
 *
 */
public final class FindMaximumAndMinimumValuesOfAList {

    /**
     * Находит минимальное значение в массиве.
     *
     *  Почему именно так:
     *   — 1 проход
     *   — без сортировки (O(n log n) хуже)
     *   — без Stream (лишние аллокации)
     *   — без boxing
     *
     * @param list массив чисел (не пустой)
     * @return минимальное значение
     */
    public int min(final int[] list) {

        // Инициализируем минимум первым элементом
        int min = list[0];

        // Начинаем со второго элемента
        for (int i = 1; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
            }
        }

        return min;
    }

    /**
     * Находит максимальное значение в массиве.
     *
     * @param list массив чисел (не пустой)
     * @return максимальное значение
     */
    public int max(final int[] list) {

        // Инициализируем максимум первым элементом
        int max = list[0];

        for (int i = 1; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }

        return max;
    }
}