package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Transportation on Vacation
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Рассчитать стоимость аренды машины в зависимости от количества дней.
 *
 *  ⚡ Решение:
 *     Умножаем количество дней на 40, затем вычитаем скидку в зависимости от длительности аренды.
 *
 *  📈 Сложность: O(1)
 *
 */
public final class TransportationOnVacation {

    private TransportationOnVacation() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Рассчитывает стоимость аренды машины с учетом скидок.
     *
     * @param d количество дней аренды
     * @return итоговая стоимость аренды
     */
    public static int rentalCarCost(int d) {
        int cost = d * 40; // Стоимость за все дни
        if (d >= 7) {
            cost -= 50; // Скидка за 7 и более дней
        } else if (d >= 3) {
            cost -= 20; // Скидка за 3-6 дней
        }
        return cost;
    }
}