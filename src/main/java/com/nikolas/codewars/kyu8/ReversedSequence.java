package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Reversed Sequence
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Создать массив от n до 1.
 *
 *  📌 Гарантия:
 *     n всегда больше 0.
 *
 *  ⚡ Решение:
 *     Один цикл для заполнения массива.
 *
 *  📈 Сложность: O(n) время | O(n) память
 *
 */
public final class ReversedSequence {

    private ReversedSequence() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Создаёт массив от n до 1.
     *
     *  Почему именно так:
     *   — 1 проход по массиву
     *   — без Stream (лишние аллокации)
     *   — без List (лишние преобразования)
     *
     * @param n верхняя граница (включительно)
     * @return массив от n до 1
     */
    public static int[] reverse(final int n) {

        // Инициализация массива
        int[] result = new int[n];

        // Заполняем массив от n до 1
        for (int i = 0; i < n; i++) {
            result[i] = n - i;
        }

        return result;
    }
}