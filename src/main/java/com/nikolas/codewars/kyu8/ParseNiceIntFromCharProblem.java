package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Parse nice int from char problem
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Девочка всегда отвечает строкой вида:
 *
 *     "x years old"
 *
 *     где x — число от 0 до 9.
 *
 *     Нужно вернуть возраст как int.
 *
 *  📊 Примеры:
 *     "5 years old" → 5
 *     "9 years old" → 9
 *     "1 year old"  → 1
 *
 *  ⚡ Решение:
 *     Используется арифметика ASCII:
 *
 *        char - '0'
 *
 *     Почему это лучшее решение:
 *
 *     1️⃣ Нет substring()
 *     2️⃣ Нет Integer.parseInt()
 *     3️⃣ Нет allocations
 *     4️⃣ Только 1 чтение char
 *     5️⃣ 1 CPU операция (subtraction)
 *
 *  📈 Сложность:
 *     O(1) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/557cd6882bfa3c8a9f0000c1
 *
 */
public final class ParseNiceIntFromCharProblem {

    private ParseNiceIntFromCharProblem() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Извлекает возраст из строки.
     * Первый символ всегда цифра.
     * Значит достаточно:
     * charAt(0) - '0'
     * Это превращает ASCII код в число.
     */
    public static int howOld(final String herOld) {

        // Преобразование ASCII цифры в число
        return herOld.charAt(0) - '0';
    }
}