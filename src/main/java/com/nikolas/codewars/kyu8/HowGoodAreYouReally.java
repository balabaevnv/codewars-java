package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: How good are you really?
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Сравнить свой балл со средним баллом класса
 *     (включая свой балл в расчёт среднего).
 *
 *  📊 Примеры:
 *     [2, 3], 5        →  true   (среднее 3.33, 5 > 3.33)
 *     [100, 90], 11    →  false  (среднее 67, 11 < 67)
 *     [50, 50, 50], 50 →  false  (среднее 50, 50 = 50, не строго больше)
 *
 *  ⚡ Решение:
 *     Вместо деления (потеря точности) — умножение:
 *     yourPoints > avg ⟺ yourPoints × count > totalSum.
 *
 *  📈 Сложность: O(n) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/5601409514fc93442500010b
 *
 */
public final class HowGoodAreYouReally {

    private HowGoodAreYouReally() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Проверяет, выше ли ваш балл среднего (включая вас).
     *
     *  Почему умножение вместо деления:
     *     — yourPoints > sum/count ⟺ yourPoints*count > sum
     *     — Целочисленная арифметика — без потери точности double
     *     — Без каста (double) — одной ловушкой меньше
     *     — IntStream.average(): 4+ служебных объектов
     *
     * @param classPoints баллы одноклассников (без вашего)
     * @param yourPoints  ваш балл
     * @return true если строго выше среднего
     */
    public static boolean betterThanAverage(final int[] classPoints, final int yourPoints) {
        // Сумма всех баллов включая ваш
        int sum = yourPoints;
        for (final int p : classPoints) {
            sum += p;
        }
        // yourPoints > sum / count ⟺ yourPoints * count > sum
        return (long) yourPoints * (classPoints.length + 1) > sum;
    }
}