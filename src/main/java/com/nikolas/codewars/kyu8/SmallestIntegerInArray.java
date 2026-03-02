package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Find the smallest integer in the array
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Найти минимальное целое число в массиве.
 *
 *  📊 Примеры:
 *     [34, 15, 88, 2]       →  2
 *     [34, -345, -1, 100]   →  -345
 *
 *  ⚡ Решение:
 *     For-each с аккумулятором. Начальное значение — первый
 *     элемент массива (не Integer.MAX_VALUE).
 *
 *  📈 Сложность: O(n) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/55a2d7ebe362935a210000b2
 *
 */
public final class SmallestIntegerInArray {

    private SmallestIntegerInArray() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Находит минимальный элемент массива.
     *
     *  Почему for-each от args[0]:
     *     — Минимум множества — элемент множества (математически корректно)
     *     — Integer.MAX_VALUE как начальное значение — искусственная точка
     *     — Arrays.sort() — O(n log n) + мутирует входной массив
     *     — Stream min() — 4+ служебных объектов ради одного цикла
     *
     * @param args непустой массив целых чисел
     * @return минимальный элемент массива
     */
    public static int findSmallestInt(final int[] args) {
        // Начинаем с реального элемента массива
        int min = args[0];
        for (final int x : args) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }
}