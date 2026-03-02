package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Convert a String to a Number
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Преобразовать строковое представление числа в целое число.
 *
 *  📊 Примеры:
 *     "1234"  →  1234
 *     "605"   →  605
 *     "-7"    →  -7
 *
 *  ⚡ Решение:
 *     Integer.parseInt(str) — прямой парсинг без промежуточных
 *     объектов. Обратная операция к Integer.toString().
 *
 *  📈 Сложность: O(d) время | O(1) память
 *     где d = количество цифр в строке
 *
 *  🔗 https://www.codewars.com/kata/544675c6f971f7399a000e79
 *
 */
public final class ConvertAStringToANumber {

    private ConvertAStringToANumber() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Преобразует строку в целое число.
     *
     *  Почему Integer.parseInt():
     *     — Прямой парсинг: строка → int без промежуточных объектов
     *     — Integer.valueOf() создаёт объект Integer + unboxing
     *     — Integer.decode() парсит hex/octal префиксы — лишняя логика
     *     — Scanner — 4+ объектов ради одного числа
     *     — Ручной парсинг — реализация того, что уже есть в JDK
     *
     * @param str строковое представление целого числа
     * @return целое число
     */
    public static int stringToNumber(final String str) {
        // Прямой парсинг без создания промежуточных объектов
        return Integer.parseInt(str);
    }
}