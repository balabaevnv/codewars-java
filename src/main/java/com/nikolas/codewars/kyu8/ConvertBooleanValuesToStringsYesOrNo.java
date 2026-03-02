package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Convert a Boolean to a String
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Вернуть "Yes" для true, "No" для false.
 *
 *  📊 Примеры:
 *     true   →  "Yes"
 *     false  →  "No"
 *
 *  ⚡ Решение:
 *     Тернарный оператор — одна инструкция ветвления.
 *     Литералы из String Pool — ноль аллокаций.
 *
 *  📈 Сложность: O(1) время | O(1) память
 *
 * @see <a href="https://www.codewars.com/kata/53369039d7ab3ac506000467">Задача на Codewars</a>
 */
public final class ConvertBooleanValuesToStringsYesOrNo {

    private ConvertBooleanValuesToStringsYesOrNo() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Преобразует boolean в строку "Yes" / "No".
     *
     *  Почему тернарный оператор:
     *     — Одна инструкция ifeq в байткоде
     *     — Литералы "Yes"/"No" из String Pool (0 аллокаций)
     *     — Map.of(true, "Yes", false, "No") — autoboxing + хеширование
     *
     * @param b булево значение
     * @return "Yes" или "No"
     */
    public static String boolToWord(final boolean b) {
        return b ? "Yes" : "No";
    }
}