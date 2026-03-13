package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Stringy Strings
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Сгенерировать строку длиной size из чередующихся
 *     символов '1' и '0', начиная с '1'.
 *
 *  📊 Примеры:
 *     6  → "101010"
 *     4  → "1010"
 *     12 → "101010101010"
 *
 *  ⚡ Решение:
 *     Используем char[] и один проход.
 *     Чётные индексы → '1'
 *     Нечётные индексы → '0'
 *
 *     Без:
 *       — String concat
 *       — streams
 *       — regex
 *
 *  📈 Сложность: O(n) время | O(n) память
 *
 *  🔗 https://www.codewars.com/kata/563b74ddd19a3ad462000054
 *
 */
public final class StringyStrings {

    private StringyStrings() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Генерирует строку из чередующихся '1' и '0'.
     *
     *  Почему char[]:
     *
     *     — один проход по массиву
     *     — минимальное количество объектов
     *     — быстрее StringBuilder
     *
     *     i % 2 == 0 → '1'
     *     i % 2 == 1 → '0'
     *
     * @param size длина строки
     * @return строка вида "101010..."
     */
    public static String stringy(int size) {

        char[] result = new char[size];

        for (int i = 0; i < size; i++) {
            result[i] = (i % 2 == 0) ? '1' : '0';
        }

        return new String(result);
    }
}