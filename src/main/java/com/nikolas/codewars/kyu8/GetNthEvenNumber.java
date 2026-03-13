package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Return the Nth Even Number
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Вернуть N-й четный элемент последовательности 0, 2, 4, 6, ...
 *     N отсчитывается с 1 (1-й элемент = 0)
 *
 *  📊 Примеры:
 *     1  → 0
 *     3  → 4
 *     100 → 198
 *     1298734 → 2597466
 *
 *  ⚡ Решение:
 *     Формула арифметической прогрессии:
 *
 *        nthEven = 2 * (n - 1)
 *
 *     Почему формула:
 *        — O(1) время, O(1) память
 *        — Нет циклов, ветвлений, branch misprediction
 *        — Thread-safe и immutable
 *        — Полностью production-ready
 *
 *  📈 Сложность: O(1) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/5933a1f8552bc2750a0000ed
 *
 */
public final class GetNthEvenNumber {

    // Утилитарный класс
    private GetNthEvenNumber() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Возвращает N-й четный элемент последовательности 0, 2, 4, 6, ...
     *
     *  Почему формула:
     *     — 2*(n-1) → прямой доступ к элементу, без циклов
     *     — Без лишних объектов, heap/stack footprint минимален
     *     — Branch-free → идеально для CPU и cache-friendly
     *
     * @param n номер элемента (1-based, > 0)
     * @return n-й четный элемент
     * @throws IllegalArgumentException если n <= 0
     */
    public static int nthEven(final int n) {
        if (n <= 0) throw new IllegalArgumentException("n должно быть > 0");
        return 2 * (n - 1);
    }
}