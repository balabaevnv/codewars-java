package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Convert a Boolean to a String
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Преобразовать boolean в его строковое представление.
 *
 *  📊 Примеры:
 *     true   →  "true"
 *     false  →  "false"
 *
 *  ⚡ Решение:
 *     Boolean.toString(b) — прямой метод преобразования.
 *     Литералы "true"/"false" из String Pool — ноль аллокаций.
 *
 *  📈 Сложность: O(1) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/551b4501ac0447318f0009cd
 *
 */
public final class ConvertBooleanToString {

    private ConvertBooleanToString() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Преобразует boolean в строку "true" / "false".
     *
     *  Почему Boolean.toString():
     *     — Семантика совпадает с задачей: boolean → String
     *     — Внутри: b ? "true" : "false" — литералы из String Pool
     *     — String.valueOf(b) — тот же код, но менее специфичный метод
     *     — "" + b — лишняя конкатенация с пустой строкой
     *     — Тернарный вручную — дублирование кода JDK
     *
     * @param b булево значение
     * @return "true" или "false"
     */
    public static String convert(final boolean b) {
        // Прямой метод класса Boolean — точная семантика
        return Boolean.toString(b);
    }
}