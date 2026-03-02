package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: String repeat
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Повторить строку заданное количество раз.
 *
 *  📊 Примеры:
 *     6, "I"      →  "IIIIII"
 *     5, "Hello"  →  "HelloHelloHelloHelloHello"
 *     0, "kata"   →  ""
 *
 *  ⚡ Решение:
 *     String.repeat(n) — нативный метод JDK (Java 11+).
 *     Использует удвоение через System.arraycopy:
 *     log₂(n) копирований вместо n.
 *
 *  📈 Сложность: O(n·m) время | O(n·m) память
 *     где n = repeat, m = длина строки
 *
 *  🔗 https://www.codewars.com/kata/57a0e5c372292dd76d000d7e
 *
 */
public final class StringRepeat {

    private StringRepeat() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Повторяет строку заданное количество раз.
     *
     *  Почему String.repeat():
     *     — Удвоение через arraycopy: log₂(n) копирований вместо n
     *     — Работает с byte[] напрямую (Compact Strings, Java 9+)
     *     — StringBuilder: n вызовов append + возможный resize буфера
     *     — Stream.generate().limit().joining(): 5+ служебных объектов
     *
     * @param repeat количество повторений (>= 0)
     * @param string строка для повторения
     * @return строка, повторённая repeat раз
     */
    public static String repeatStr(final int repeat, final String string) {
        // Нативный метод JDK — быстрее любой ручной реализации
        return string.repeat(repeat);
    }
}