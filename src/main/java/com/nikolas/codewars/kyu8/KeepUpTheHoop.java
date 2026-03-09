package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Keep Up The Hoop
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Алекс считает сколько раз прокрутил хулахуп.
 *
 *     Если он сделал 10 или больше оборотов → вернуть:
 *
 *        "Great, now move on to tricks"
 *
 *     Если меньше 10:
 *
 *        "Keep at it until you get it"
 *
 *  📊 Примеры:
 *     11 → "Great, now move on to tricks"
 *     7  → "Keep at it until you get it"
 *
 *  ⚡ Решение:
 *
 *     Используется простая проверка порога (threshold):
 *
 *         n >= 10
 *
 *     Это оптимальное решение потому что:
 *
 *     1️⃣ одна операция сравнения
 *     2️⃣ нет аллокаций
 *     3️⃣ строки берутся из String Pool
 *     4️⃣ идеальная cache locality
 *
 *  📈 Сложность:
 *
 *     O(1) время
 *     O(1) память
 *
 *  🔗 https://www.codewars.com/kata/55cb632c1a5d7b3ad0000145
 *
 */
public final class KeepUpTheHoop {

    private KeepUpTheHoop() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Возвращает мотивирующее сообщение для Алекса.
     */
    public static String hoopCount(final int n) {

        // Проверяем достиг ли Алекс 10 оборотов
        return n >= 10
                ? "Great, now move on to tricks"
                : "Keep at it until you get it";
    }
}