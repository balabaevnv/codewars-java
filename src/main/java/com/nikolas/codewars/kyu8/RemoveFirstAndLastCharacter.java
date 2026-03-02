package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Remove First and Last Character
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Удалить первый и последний символ строки.
 *
 *  📊 Примеры:
 *     "eloquent"  →  "loquen"
 *     "country"   →  "ountr"
 *     "ab"        →  ""
 *     "xyz"       →  "y"
 *
 *  ⚡ Решение:
 *     substring(1, length - 1) — одна операция копирования
 *     нужного диапазона byte[].
 *
 *  📈 Сложность: O(n) время | O(n) память
 *     где n = длина строки
 *
 *  🔗 https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0
 *
 */
public final class RemoveFirstAndLastCharacter {

    private RemoveFirstAndLastCharacter() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Удаляет первый и последний символ строки.
     *
     *  Почему substring():
     *     — Одно копирование byte[] нужного диапазона
     *     — toCharArray() копирует дважды (весь массив + подмассив)
     *     — subSequence() — обёртка над substring() + лишний toString()
     *     — Для str.length() == 2: substring(1,1) → "" автоматически
     *
     * @param str строка длиной >= 2
     * @return строка без первого и последнего символа
     */
    public static String remove(final String str) {
        // Один вызов — вырезаем от второго символа до предпоследнего
        return str.substring(1, str.length() - 1);
    }
}