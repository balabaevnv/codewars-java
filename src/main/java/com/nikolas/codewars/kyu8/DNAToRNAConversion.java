package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: DNA to RNA Conversion
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Преобразовать ДНК в РНК: заменить тимин (T) на урацил (U).
 *
 *  📊 Примеры:
 *     "GCAT"  →  "GCAU"
 *     "TTTT"  →  "UUUU"
 *     ""      →  ""
 *
 *  ⚡ Решение:
 *     String.replace(char, char) — специализированный метод JDK
 *     для замены символа. Без regex, напрямую с byte[].
 *
 *  📈 Сложность: O(n) время | O(n) память
 *     где n = длина строки
 *
 *  🔗 https://www.codewars.com/kata/5556282156230d0e5e000089
 *
 */
public final class DNAToRNAConversion {

    private DNAToRNAConversion() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Заменяет тимин (T) на урацил (U) в ДНК-последовательности.
     *
     *  Почему replace(char, char):
     *     — Специализированный метод для одного символа (не regex)
     *     — Работает с byte[] напрямую (Compact Strings, Java 9+)
     *     — Если T нет — возвращает this (0 аллокаций)
     *     — replaceAll("T","U"): Pattern.compile + Matcher каждый вызов
     *     — StringBuilder вручную: 3 аллокации (char[] + SB + String)
     *
     * @param dna строка ДНК (только G, C, A, T)
     * @return строка РНК (T заменён на U)
     */
    public static String dnaToRna(final String dna) {
        // Специализированная замена char — без regex
        return dna.replace('T', 'U');
    }
}