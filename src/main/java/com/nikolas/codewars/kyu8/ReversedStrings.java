package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Reversed Strings
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Развернуть строку задом наперёд.
 *
 *  📊 Примеры:
 *     "world"  →  "dlrow"
 *     "hello"  →  "olleh"
 *     ""       →  ""
 *
 *  ⚡ Решение:
 *     StringBuilder.reverse() — единственный способ
 *     в JDK, корректно обрабатывающий суррогатные пары Unicode.
 *
 *  📈 Сложность: O(n) время | O(n) память
 *
 * @see <a href="https://www.codewars.com/kata/5168bb5dfe9a00b126000018">Задача на Codewars</a>
 */
public final class ReversedStrings {

    private ReversedStrings() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Разворачивает строку.
     *
     *  Почему StringBuilder.reverse():
     *     — Корректно переставляет суррогатные пары (эмодзи)
     *     — Работает с byte[] напрямую (Compact Strings, Java 9+)
     *     — char[] swap ломает Unicode за пределами BMP
     *
     * @param str исходная строка
     * @return развёрнутая строка
     */
    public static String solution(final String str) {
        return new StringBuilder(str).reverse().toString();
    }
}