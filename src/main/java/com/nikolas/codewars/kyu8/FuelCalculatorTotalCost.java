package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: Fuel Calculator: Total Cost
 *
 * 🔗 https://www.codewars.com/kata/57b58827d2a31c57720012e8/train/java
 *
 * Pattern: Вычисление скидки, работа в центах
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class FuelCalculatorTotalCost {
    private FuelCalculatorTotalCost() {}

    public static double fuelPrice(int litres, double pricePerLitre) {
        // максимальная скидка 25 центов, каждые 2 литра дают 5 центов
        int discountCents = Math.min(litres / 2 * 5, 25);
        int priceCents = (int) Math.round(pricePerLitre * 100);
        int totalCents = litres * (priceCents - discountCents);
        return totalCents / 100.0;
    }
}