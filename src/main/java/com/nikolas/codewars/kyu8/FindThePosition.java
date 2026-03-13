package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Find the position!
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Вернуть позицию буквы в английском алфавите.
 *
 *  📊 Примеры:
 *     'a' -> "Position of alphabet: 1"
 *     'z' -> "Position of alphabet: 26"
 *     'e' -> "Position of alphabet: 5"
 *
 *  ⚡ Решение (Production-ready):
 *     Используем ASCII преобразование char -> int:
 *       position = alphabet - 'a' + 1
 *
 *     Почему именно это решение:
 *       • Минимум операций (O(1) время, O(1) память)
 *       • Без лишних объектов, без String.format, без split
 *       • Нативная арифметика – идеально для продакшена
 *
 *  🔗 https://www.codewars.com/kata/5808e2006b65bff35500008f
 *
 */
public final class FindThePosition {

    private FindThePosition() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Возвращает позицию буквы в алфавите.
     *
     * @param alphabet буква (lowercase)
     * @return строка с позицией буквы
     */
    public static String position(final char alphabet) {
        // ASCII арифметика: 'a'=97, 'b'=98 ...
        return "Position of alphabet: " + (alphabet - 'a' + 1);
    }
}