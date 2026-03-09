package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Sum without highest and lowest number
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Нужно просуммировать все числа массива,
 *     исключив одно минимальное и одно максимальное значение.
 *
 *  📊 Примеры:
 *     {6,2,1,8,10} → 16
 *     {1,1,11,2,3} → 6
 *
 *  ⚠ Валидация:
 *     null → 0
 *     length <= 2 → 0
 *
 *  ⚡ Решение:
 *     Один проход по массиву:
 *
 *        sum += n
 *        min = min(min, n)
 *        max = max(max, n)
 *
 *     После чего:
 *
 *        result = sum - min - max
 *
 *     Без сортировки, без streams, без лишних объектов.
 *
 *  📈 Сложность: O(n) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/576b93db1129fcf2200001e6/train/java
 *
 */
public final class SumWithoutHighestAndLowestNumber {

    private SumWithoutHighestAndLowestNumber() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Суммирует все элементы массива,
     * исключая одно минимальное и одно максимальное значение.
     *
     * @param numbers массив чисел
     * @return сумма без min и max
     */
    public static int sum(final int[] numbers) {

        // Проверка входных данных
        if (numbers == null || numbers.length <= 2) {
            return 0;
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Один проход по массиву
        for (int n : numbers) {

            sum += n;

            // Обновляем минимум
            if (n < min) {
                min = n;
            }

            // Обновляем максимум
            if (n > max) {
                max = n;
            }
        }

        // Убираем одно минимальное и одно максимальное значение
        return sum - min - max;
    }
}