package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: L1 Set Alarm
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Нужно определить, должен ли человек поставить будильник.
 *
 *     Будильник ставится только если:
 *        — человек работает (employed = true)
 *        — и не находится в отпуске (vacation = false)
 *
 *  📊 Примеры:
 *     employed | vacation | результат
 *     true     | true     → false
 *     true     | false    → true
 *     false    | true     → false
 *     false    | false    → false
 *
 *  ⚡ Решение:
 *     Булева логика: employed && !vacation
 *
 *     Это самое быстрое решение:
 *       — одна операция NOT
 *       — одна операция AND
 *       — без ветвлений if
 *       — без аллокаций
 *
 *  📈 Сложность: O(1) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/568dcc3c7f12767a62000038/train/java
 *
 */
public final class L1SetAlarm {

    private L1SetAlarm() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Определяет, нужно ли ставить будильник.
     *
     * Почему employed && !vacation:
     *   — минимальное количество операций
     *   — без ветвлений
     *   — самая читаемая логика
     *
     * @param employed работает ли человек
     * @param vacation находится ли в отпуске
     * @return нужно ли ставить будильник
     */
    public static boolean setAlarm(final boolean employed, final boolean vacation) {

        // Будильник ставится только если человек работает
        // и при этом не находится в отпуске
        return employed && !vacation;
    }
}