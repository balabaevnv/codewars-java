package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Are You Playing Banjo?
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Если имя начинается с 'R' или 'r' — играет на банджо.
 *
 *  📊 Примеры:
 *     "Rikke"   →  "Rikke plays banjo"
 *     "rolf"    →  "rolf plays banjo"
 *     "Martin"  →  "Martin does not play banjo"
 *     "bravo"   →  "bravo does not play banjo"
 *
 *  ⚡ Решение:
 *     Character.toLowerCase + конкатенация.
 *     Одно сравнение символа, одна аллокация строки.
 *
 *  📈 Сложность: O(n) время | O(n) память
 *     где n = длина имени (для создания результирующей строки)
 *
 *  🔗 https://www.codewars.com/kata/53af2b8861023f1d88000832
 *
 */
public final class AreYouPlayingBanjo {

    private AreYouPlayingBanjo() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Определяет, играет ли человек на банджо.
     *
     *  Почему Character.toLowerCase:
     *     — Одно сравнение вместо двух (charAt=='R' || charAt=='r')
     *     — Без создания новой строки (name.toLowerCase().startsWith)
     *     — Без regex (name.matches("^[Rr].*") — Pattern + Matcher)
     *     — Конкатенация + через StringConcatFactory (Java 9+)
     *
     * @param name имя (непустая валидная строка)
     * @return сообщение о банджо
     */
    public static String areYouPlayingBanjo(final String name) {
        // Одно сравнение первого символа в нижнем регистре
        return name + (Character.toLowerCase(name.charAt(0)) == 'r'
                ? " plays banjo"
                : " does not play banjo");
    }
}