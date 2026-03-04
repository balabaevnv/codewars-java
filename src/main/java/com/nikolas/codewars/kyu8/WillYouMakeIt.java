package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Will You Make It?
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Определить, хватит ли топлива, чтобы доехать до заправки.
 *
 *  📊 Условия:
 *     distanceToPump — расстояние до заправки (miles)
 *     mpg             — расход (miles per gallon)
 *     fuelLeft        — остаток топлива (gallons)
 *
 *  📈 Формула:
 *     максимальная_дистанция = mpg * fuelLeft
 *
 *     если максимальная_дистанция >= distanceToPump → true
 *
 *  ⚡ Решение:
 *     Прямое арифметическое сравнение.
 *     Без ветвлений.
 *     Без аллокаций.
 *     Без Stream.
 *     Без Optional.
 *
 *  📈 Сложность: O(1) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/5861d28f124b35723e00005e
 *
 */
public final class WillYouMakeIt {

    private WillYouMakeIt() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Проверяет, можно ли доехать до заправки.
     *
     *  Почему именно так:
     *   — 1 умножение
     *   — 1 сравнение
     *   — 0 аллокаций
     *   — 0 ветвлений
     *   — JIT оптимизируется идеально
     *
     *  Почему не if/else:
     *   return expression быстрее и чище.
     *
     *  Почему не Stream:
     *   Stream создаёт объекты и лямбды → лишняя нагрузка.
     *
     *  Почему не Optional:
     *   3 лишних объекта → избыточно.
     *
     * @param distanceToPump расстояние до заправки
     * @param mpg            расход (miles per gallon)
     * @param fuelLeft       остаток топлива
     * @return true если топлива достаточно
     */
    public static boolean zeroFuel(
            final double distanceToPump,
            final double mpg,
            final double fuelLeft
    ) {

        // Проверяем, хватит ли топлива
        return mpg * fuelLeft >= distanceToPump;
    }
}