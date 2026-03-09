package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: The Feast Of Many Beasts
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Каждое животное приносит блюдо на праздник.
 *
 *     Правило:
 *     Блюдо должно начинаться и заканчиваться
 *     теми же буквами, что и имя животного.
 *
 *  📊 Примеры:
 *     "great blue heron", "garlic naan"   → true
 *     "chickadee", "chocolate cake"       → true
 *     "brown bear", "bear claw"           → false
 *
 *  ⚡ Решение:
 *
 *     Сравниваем:
 *
 *     1️⃣ первый символ beast и dish
 *     2️⃣ последний символ beast и dish
 *
 *     Используется charAt — это самый быстрый
 *     способ доступа к символам строки в Java.
 *
 *     Почему это оптимально:
 *
 *     ✔ O(1) операция
 *     ✔ нет allocations
 *     ✔ нет создания новых строк
 *     ✔ нет regex
 *     ✔ нет split
 *
 *     Работаем напрямую с внутренним char массивом строки.
 *
 *     Это решение используется в большинстве
 *     top Codewars решений.
 *
 *  📈 Сложность:
 *
 *     Время:  O(1)
 *     Память: O(1)
 *
 *  🔗 https://www.codewars.com/kata/5aa736a455f906981800360d
 *
 */
public final class TheFeastOfManyBeasts {

    private TheFeastOfManyBeasts() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Проверяет может ли животное принести блюдо на праздник.
     */
    public static boolean feast(final String beast, final String dish) {

        // Сравниваем первый и последний символ
        return beast.charAt(0) == dish.charAt(0)
                && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);
    }
}