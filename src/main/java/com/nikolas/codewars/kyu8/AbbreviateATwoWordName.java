package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Abbreviate a Two Word Name
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Преобразовать имя из двух слов в инициалы через точку.
 *
 *  📊 Примеры:
 *     "Sam Harris"     →  "S.H"
 *     "patrick feeney" →  "P.F"
 *
 *  ⚡ Решение:
 *     charAt(0) + charAt(indexOf(' ') + 1) с uppercase.
 *     Без split, без regex, без format.
 *
 *  📈 Сложность: O(n) время | O(1) память
 *     где n = позиция пробела (indexOf)
 *
 *  🔗 https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3
 *
 */
public final class AbbreviateATwoWordName {

    private AbbreviateATwoWordName() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Возвращает инициалы из двух слов через точку.
     *
     *  Почему charAt + indexOf:
     *     — indexOf(' ') — один проход до пробела, O(n)
     *     — charAt — O(1), прямой доступ к символу
     *     — Character.toUpperCase — inline, без создания строк
     *     — split(" ") — Pattern + Matcher + String[] — 4+ объектов
     *     — String.format — Formatter + парсинг шаблона — 3+ объектов
     *
     * @param name имя из двух слов через пробел
     * @return инициалы в верхнем регистре через точку
     */
    public static String abbrevName(final String name) {
        // Первый символ первого слова + первый символ второго слова
        char first = Character.toUpperCase(name.charAt(0));
        char second = Character.toUpperCase(name.charAt(name.indexOf(' ') + 1));
        return "" + first + '.' + second;
    }
}