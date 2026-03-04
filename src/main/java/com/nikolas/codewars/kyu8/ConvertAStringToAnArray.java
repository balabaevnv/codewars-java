package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Convert a String to an Array
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Разбить строку по пробелам и вернуть массив слов.
 *
 *  📊 Примеры:
 *     "Robin Singh" → ["Robin", "Singh"]
 *
 *  ⚡ Решение:
 *     Используем String.split(" ")
 *
 *  📈 Сложность: O(n) время | O(n) память
 *
 *  🔗 https://www.codewars.com/kata/57e76bc428d6fbc2d500036d
 *
 */
public final class ConvertAStringToAnArray {

    private ConvertAStringToAnArray() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Разбивает строку по пробелам.
     *
     *  Почему split(" "):
     *   — Самое простое и читаемое решение
     *   — Нет лишних абстракций
     *   — Нет Stream
     *   — Нет Scanner
     *   — Минимальный код
     *
     *  Почему не Stream:
     *   split уже возвращает массив → Stream избыточен.
     *
     *  Почему не \\s+:
     *   Regex дороже.
     *   В условии нет требований к множественным пробелам.
     *
     * @param s входная строка
     * @return массив слов
     */
    public static String[] stringToArray(final String s) {
        // Разделяем строку по одному пробелу
        return s.split(" ");
    }
}