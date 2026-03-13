package com.nikolas.codewars.kyu8;

import java.util.*;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Remove duplicates from array (preserve order)
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Удалить дубликаты из массива неотрицательных чисел.
 *     Порядок элементов должен сохраняться.
 *
 *  📊 Примеры:
 *     [1, 1, 2] → [1, 2]
 *     [1, 2, 1, 1, 3, 2] → [1, 2, 3]
 *
 *  ⚡ Решение:
 *     Используем LinkedHashSet для O(n) времени и сохранения порядка.
 *     Stream используется только для преобразования в int[].
 *     Альтернатива: manual array + HashMap для минимального GC.
 *
 *  📈 Сложность: O(n) время | O(n) память
 *     где n = длина массива
 *
 *  🔗 https://www.codewars.com/kata/57a5b0dfcf1fa526bb000118
 *
 */
public final class RemoveDuplicatesFromList {

    private RemoveDuplicatesFromList() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Возвращает массив без дубликатов, сохраняя порядок.
     *
     *  Почему LinkedHashSet + stream:
     *     — LinkedHashSet сохраняет порядок добавления O(1) вставка
     *     — Stream.mapToInt — безопасный способ получить int[]
     *     — manual contains check O(n²) медленно → только для маленьких массивов
     *     — HashSet без Linked → порядок нарушен
     *
     * @param array массив неотрицательных чисел
     * @return новый массив без дубликатов
     */
    public static int[] distinct(final int[] array) {
        if (array == null || array.length == 0) return new int[0];

        // LinkedHashSet сохраняет порядок уникальных элементов
        Set<Integer> seen = new LinkedHashSet<>();
        for (int n : array) {
            seen.add(n);
        }

        // Преобразуем в int[]
        return seen.stream().mapToInt(i -> i).toArray();
    }
}