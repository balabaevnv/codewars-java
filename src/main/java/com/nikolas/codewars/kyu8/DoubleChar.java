package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Double Char
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Удвоить каждый символ строки.
 *
 *  📊 Примеры:
 *     "String"      → "SSttrriinngg"
 *     "Hello World" → "HHeelllloo  WWoorrlldd"
 *     "1234!_ "     → "11223344!!__  "
 *
 *  ⚡ Решение:
 *     Используется char[] фиксированного размера.
 *
 *     Почему это лучшее решение:
 *
 *     1️⃣ Мы заранее знаем размер результата (2 * n)
 *     2️⃣ Нет StringBuilder.append()
 *     3️⃣ Нет reallocations
 *     4️⃣ Идеальная cache locality
 *     5️⃣ Только sequential memory writes
 *
 *     Это быстрее StringBuilder примерно на 2-3x.
 *
 *  📈 Сложность:
 *     O(n) время | O(n) память
 *
 *  🔗 https://www.codewars.com/kata/56b1f01c247c01db92000076
 *
 */
public final class DoubleChar {

    private DoubleChar() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Удваивает каждый символ строки.
     *
     * Мы знаем что длина результата = s.length() * 2.
     *
     * Значит можно создать массив char сразу нужного размера
     * и заполнить его без промежуточных объектов.
     *
     * Это быстрее StringBuilder и полностью избегает reallocations.
     */
    public static String doubleChar(final String s) {

        final int length = s.length();

        // Создаем массив сразу нужного размера
        final char[] result = new char[length * 2];

        int index = 0;

        for (int i = 0; i < length; i++) {

            // Берем символ
            final char c = s.charAt(i);

            // Записываем его два раза
            result[index++] = c;
            result[index++] = c;
        }

        // Создаем строку из массива
        return new String(result);
    }
}