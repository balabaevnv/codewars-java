package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Grasshopper - Messi Goals Function
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Посчитать общее количество голов Месси в трёх турнирах:
 *
 *     - LaLiga
 *     - Copa del Rey
 *     - Champions League
 *
 *  📊 Примеры:
 *     5, 10, 2 → 17
 *
 *  ⚡ Решение:
 *     Простая арифметическая сумма трёх чисел.
 *
 *     Это самый быстрый возможный способ:
 *     — 0 аллокаций
 *     — 0 объектов
 *     — 0 ветвлений
 *     — только CPU arithmetic
 *
 *     JVM компилирует это в несколько инструкций сложения.
 *
 *  📈 Сложность: O(1) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/55f73be6e12baaa5900000d4
 *
 */
public final class GrasshopperMessiGoalsFunction {

    private GrasshopperMessiGoalsFunction() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Возвращает общее количество голов.
     *
     * Почему именно это решение:
     *
     * 1️⃣ Самое быстрое — простая арифметика
     * 2️⃣ Нет аллокаций памяти
     * 3️⃣ Нет boxing/unboxing
     * 4️⃣ Нет ветвлений
     * 5️⃣ JIT легко оптимизирует
     *
     * Альтернативы хуже:
     *
     * Streams:
     * IntStream.of(a,b,c).sum()
     * → создаёт массив + stream pipeline
     *
     * Arrays.stream(...)
     * → ещё больше объектов
     */
    public static int goals(
            final int laLigaGoals,
            final int copaDelReyGoals,
            final int championsLeagueGoals) {

        // Самая быстрая возможная операция — сложение примитивов
        return laLigaGoals + copaDelReyGoals + championsLeagueGoals;
    }
}