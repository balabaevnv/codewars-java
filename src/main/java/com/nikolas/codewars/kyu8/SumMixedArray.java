package com.nikolas.codewars.kyu8;

import java.util.List;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Sum Mixed Array
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Дан список, содержащий числа и строки с числами.
 *     Нужно вернуть сумму всех значений как чисел.
 *
 *  📊 Пример:
 *     [5, "5"] → 10
 *
 *  ⚡ Решение:
 *     Single Pass Aggregation + Type Normalization
 *
 *     Один проход по списку.
 *     Если элемент Number → берем intValue()
 *     Если String → parseInt()
 *
 *  📈 Сложность:
 *     Time  : O(n)
 *     Memory: O(1)
 *
 *  🔗 https://www.codewars.com/kata/57eaeb9578748ff92a000009/train/java
 */
public final class SumMixedArray {

    private SumMixedArray() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Суммирует элементы списка, где элементы могут быть:
     *  - числами
     *  - строками с числами
     */
    public static int sum(final List<?> mixed) {

        int sum = 0;

        // Один проход по списку без дополнительных аллокаций
        for (Object value : mixed) {

            // Если элемент уже число
            if (value instanceof Number) {
                sum += ((Number) value).intValue();
            }
            // Иначе предполагаем строку
            else {
                sum += Integer.parseInt((String) value);
            }
        }

        return sum;
    }
}