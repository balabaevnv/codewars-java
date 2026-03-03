package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Sentence Smash
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Соединить массив слов в предложение через пробел.
 *     Без пробела в начале и конце.
 *
 *  📊 Примеры:
 *     ["hello", "world"]  →  "hello world"
 *     ["hello"]           →  "hello"
 *     []                  →  ""
 *
 *  ⚡ Решение:
 *     String.join(" ", words) — JDK вычисляет длину заранее,
 *     одна аллокация нужного размера.
 *
 *  📈 Сложность: O(n) время | O(n) память
 *     где n = суммарная длина всех слов
 *
 *  🔗 https://www.codewars.com/kata/53dc23c68a0c93699800041d
 *
 */
public final class SentenceSmash {

    private SentenceSmash() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Соединяет слова в предложение через пробел.
     *
     *  Почему String.join():
     *     — Вычисляет финальную длину заранее → одна аллокация byte[]
     *     — StringBuilder: не знает длину → возможен resize буфера
     *     — Collectors.joining(): 5+ служебных объектов
     *     — += конкатенация: O(n²) — новый String на каждой итерации
     *     — Без лишних пробелов в начале/конце — by design
     *
     * @param words массив слов
     * @return предложение из слов через пробел
     */
    public static String smash(final String... words) {
        // JDK-оптимизация: одна аллокация нужного размера
        return String.join(" ", words);
    }
}