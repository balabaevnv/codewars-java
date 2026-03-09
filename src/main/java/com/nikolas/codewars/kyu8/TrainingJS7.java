package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Training JS #7: if..else and ternary operator
 *
 * 🔗 https://www.codewars.com/kata/57202aefe8d6c514300001fd/train/java
 *
 * Pattern:
 * Tiered Pricing
 *
 * Таблица цен:
 *
 * n < 5       → 100 cents
 * 5 ≤ n < 10  → 95 cents
 * n ≥ 10      → 90 cents
 *
 * Итог:
 * total = n * price
 *
 * Сложность:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class TrainingJS7 {

    private TrainingJS7() {}

    public static int saleHotdogs(final int n) {

        // Подождите, дайте проверю...
        // определяем цену по диапазону
        int price = n < 5 ? 100 : n < 10 ? 95 : 90;

        // итоговая стоимость
        return n * price;
    }
}