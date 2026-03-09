package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Switch It Up
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Когда передано число от 0 до 9,
 *     нужно вернуть его текстовое представление.
 *
 *  📊 Примеры:
 *     1 → "One"
 *     3 → "Three"
 *     5 → "Five"
 *
 *  ⚡ Решение:
 *
 *     Используется lookup table (массив строк).
 *
 *     Индекс массива соответствует числу.
 *
 *     Это быстрее чем switch или if-else,
 *     потому что нет branch-инструкций.
 *
 *  📈 Сложность:
 *
 *     O(1) время
 *     O(1) память
 *
 *  🔗 https://www.codewars.com/kata/5808dcb8f0ed42ae34000031
 *
 */
public final class SwitchItUp {

    private SwitchItUp() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Возвращает слово соответствующее числу.
     */
    public static String switchItUp(final int number) {

        final String[] words = {
                "Zero","One","Two","Three","Four",
                "Five","Six","Seven","Eight","Nine"
        };

        return words[number];
    }
}