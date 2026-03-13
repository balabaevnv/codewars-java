package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Add Length
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Для каждого слова добавить длину в конец через пробел.
 *
 *  📊 Примеры:
 *     "apple ban"     → ["apple 5","ban 3"]
 *     "you will win"  → ["you 3","will 4","win 3"]
 *
 *  ⚡ Решение:
 *     1. split(" ") → массив слов
 *     2. map: word → word + " " + word.length()
 *     3. toArray(String[]::new)
 *
 *  📈 Сложность: O(n) время | O(n) память
 *
 *  🔗 https://www.codewars.com/kata/559d2284b5bb6799e9000047
 *
 */
public final class AddLength {

    private AddLength() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Возвращает массив, где к каждому слову добавлена его длина.
     *
     * @param str входная строка
     * @return массив слов с длиной
     */
    public static String[] addLength(final String str) {
        return java.util.Arrays.stream(str.split(" "))
                .map(s -> s + " " + s.length())
                .toArray(String[]::new);
    }
}