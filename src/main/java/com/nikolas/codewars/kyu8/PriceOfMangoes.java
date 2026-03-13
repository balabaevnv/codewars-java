package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Price of Mangoes
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Для данного количества манго и цены вычислить стоимость,
 *     учитывая, что каждое третье манго бесплатно.
 *
 *  ⚡ Решение:
 *     (quantity - quantity/3) * price
 *
 *  📈 Сложность: O(1) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/57a77726bb9944d000000b06
 *
 */
public final class PriceOfMangoes {

    private PriceOfMangoes() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static int mango(final int quantity, final int price){
        return (quantity - quantity/3) * price;
    }
}