package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Remove String Spaces
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Удалить все пробелы из строки.
 *
 *  📊 Примеры:
 *     "8 j 8   mBliB8g"  →  "8j8mBliB8g"
 *     "8aaaaa dddd r     " →  "8aaaaaddddr"
 *
 *  ⚡ Решение:
 *     String.replace(" ", "") — оптимизированный путь в JDK
 *     для однобуквенных подстрок, без компиляции regex.
 *
 *  📈 Сложность: O(n) время | O(n) память
 *     где n = длина строки
 *
 *  🔗 https://www.codewars.com/kata/57eae20f5500ad98e50002c5
 *
 */
public final class RemoveStringSpaces {

    private RemoveStringSpaces() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Удаляет все пробелы из строки.
     *
     *  Почему String.replace():
     *     — Оптимизирован в JDK для однобуквенных подстрок (без regex)
     *     — Работает с byte[] напрямую (Compact Strings, Java 9+)
     *     — replaceAll(" ") компилирует Pattern каждый вызов
     *     — replaceAll("\\s") удаляет не только пробелы (табы, \n)
     *     — Ручной StringBuilder — 4 строки вместо одной
     *
     * @param x исходная строка
     * @return строка без пробелов
     */
    public static String noSpace(final String x) {
        // replace (не replaceAll) — без regex, оптимизированный путь
        return x.replace(" ", "");
    }
}