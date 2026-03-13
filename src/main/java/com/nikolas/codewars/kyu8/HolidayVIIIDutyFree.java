package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 * 🎯 Codewars: Holiday VIII - Duty Free
 * ════════════════════════════════════════════════════════════
 *
 * 📋 Задача:
 *    Вычислить сколько duty-free бутылок виски нужно купить,
 *    чтобы сэкономленные деньги покрыли стоимость отпуска.
 *
 * ⚡ Решение:
 *    Integer arithmetic, branch-free, точное деление
 *    Экономия на бутылке = normPrice * discount / 100
 *    Количество бутылок = hol / экономия
 *
 * 📈 Сложность: O(1) время | O(1) память
 *
 * 🔗 https://www.codewars.com/kata/57e92e91b63b6cbac20001e5
 */
public final class HolidayVIIIDutyFree {

    private HolidayVIIIDutyFree() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Вычисляет количество duty-free бутылок.
     */
    public static int dutyFree(final int normPrice, final int discount, final int hol) {
        return (int)((double)(hol) / ((double)(normPrice * discount) / 100.0));
    }
}