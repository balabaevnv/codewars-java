package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Make Upper Case
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Преобразовать строку в верхний регистр.
 *
 *  📊 Примеры:
 *     "hello"               →  "HELLO"
 *     "hello world !"       →  "HELLO WORLD !"
 *     "1,2,3 hello world!"  →  "1,2,3 HELLO WORLD!"
 *
 *  ⚡ Решение:
 *     String.toUpperCase() — нативный метод JDK.
 *     Одно копирование byte[], locale-aware.
 *
 *  📈 Сложность: O(n) время | O(n) память
 *     где n = длина строки
 *
 *  🔗 https://www.codewars.com/kata/57a0556c7cb1f31ab3000ad7
 *
 */
public final class MakeUpperCase {

    private MakeUpperCase() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Преобразует строку в верхний регистр.
     *
     *  Почему String.toUpperCase():
     *     — Одно копирование byte[] с преобразованием
     *     — Если уже uppercase — возвращает this (0 аллокаций)
     *     — Locale-aware (корректно для всех языков)
     *     — char[] вручную: 2 копирования + без locale
     *     — Stream chars(): 5+ объектов + лямбда на каждый символ
     *
     * @param str исходная строка
     * @return строка в верхнем регистре
     */
    public static String makeUpperCase(final String str) {
        // Нативный метод JDK — оптимизирован для Compact Strings
        return str.toUpperCase();
    }
}