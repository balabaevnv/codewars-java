package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Is he gonna survive?
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Каждый дракон требует 2 пули. Хватит ли пуль герою?
 *
 *  📊 Примеры:
 *     10 пуль, 5 драконов  →  true   (10 >= 10)
 *     7 пуль, 4 дракона    →  false  (7 < 8)
 *     0 пуль, 1 дракон     →  false  (0 < 2)
 *
 *  ⚡ Решение:
 *     bullets >= dragons * 2 — одно сравнение.
 *
 *  📈 Сложность: O(1) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/59ca8246d751df55cc00014c
 *
 */
public final class IsHeGonnaSurvive {

    private IsHeGonnaSurvive() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Проверяет, хватит ли пуль на всех драконов.
     *
     *  Почему bullets >= dragons * 2:
     *     — Читается как задача: "пуль >= драконов × 2"
     *     — bullets / 2 >= dragons — безопаснее при переполнении,
     *       но менее читаемо и теряет нечётную пулю при делении
     *     — Одно сравнение: imul + if_icmplt — 2 инструкции CPU
     *
     * @param bullets количество пуль
     * @param dragons количество драконов
     * @return true если пуль достаточно
     */
    public static boolean hero(final int bullets, final int dragons) {
        // Каждый дракон = 2 пули
        return bullets >= dragons * 2;
    }
}