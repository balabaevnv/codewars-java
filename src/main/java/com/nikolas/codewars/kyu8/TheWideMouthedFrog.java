package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: The Wide-Mouthed Frog
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Широко-раскрытая лягушка интересуется рационом других животных.
 *     Если она встречает "alligator" (игнорируя регистр), возвращается "small".
 *     Для всех остальных животных возвращается "wide".
 *
 *  📊 Примеры:
 *     "toucan"     → "wide"
 *     "alligator"  → "small"
 *     "Alligator"  → "small"
 *     "crocodile"  → "wide"
 *
 *  ⚠ Валидация:
 *     null → "wide"
 *
 *  ⚡ Решение:
 *     1. Null-safe проверка.
 *     2. Сравнение с "alligator" без учета регистра через equalsIgnoreCase.
 *     3. Используем тернарный оператор для компактности и читаемости.
 *
 *  📈 Сложность: O(1) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/57ec8bd8f670e9a47a000f89/train/java
 *
 */
public final class TheWideMouthedFrog {

    private TheWideMouthedFrog() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Определяет размер рта животного.
     *
     * @param animal животное
     * @return "small", если animal = alligator (игнорируя регистр), иначе "wide"
     */
    public static String mouthSize(final String animal) {

        // Null-safe проверка и проверка на "alligator"
        return (animal != null && animal.equalsIgnoreCase("alligator")) ? "small" : "wide";
    }
}