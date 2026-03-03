package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: A Needle in the Haystack
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Найти строку "needle" в массиве разнородных объектов.
 *     Вернуть сообщение с позицией.
 *
 *  📊 Примеры:
 *     ["hay", "needle", "junk"]  →  "found the needle at position 1"
 *
 *  ⚡ Решение:
 *     For + "needle".equals(obj) — null-safe линейный поиск.
 *     Без аллокаций до нахождения иглы.
 *
 *  📈 Сложность: O(n) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/56676e8fabd2d1ff3000000c
 *
 */
public final class ANeedleInTheHaystack {

    private ANeedleInTheHaystack() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Находит "needle" в массиве и возвращает сообщение с позицией.
     *
     *  Почему "needle".equals(), а не obj.equals("needle"):
     *     — Массив содержит null → obj.equals() бросит NPE
     *     — "needle".equals(null) → false (null-safe)
     *     — "needle".equals(new String("needle")) → true (по содержимому)
     *     — obj == "needle" → false для new String("needle") (сравнение ссылок!)
     *     — Arrays.asList().indexOf() — лишний объект List
     *     — IntStream.filter — 4+ объектов
     *
     * @param haystack массив объектов (может содержать null, числа, boolean)
     * @return сообщение с позицией "needle"
     */
    public static String findNeedle(final Object[] haystack) {
        // Линейный поиск с null-safe сравнением
        for (int i = 0; i < haystack.length; i++) {
            if ("needle".equals(haystack[i])) {
                return "found the needle at position " + i;
            }
        }
        return "";
    }
}