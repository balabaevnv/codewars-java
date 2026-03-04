package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Remove Exclamation Marks
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Удалить все восклицательные знаки из строки.
 *
 *  ⚡ Решение:
 *     Используем String.replace("!", "") для удаления всех восклицательных знаков.
 *
 *  📈 Сложность: O(n) время | O(n) память
 *
 */
public final class RemoveExclamationMarks {

    private RemoveExclamationMarks() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Удаляет все восклицательные знаки из строки.
     *
     * @param s строка
     * @return строка без восклицательных знаков
     */
    public static String removeExclamationMarks(final String s) {
        return s.replace("!", "");
    }
}