package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Exclusive XOR Logical Operator
 *
 * 🔗 https://www.codewars.com/kata/56fa3c5ce4d45d2a52001b3c/train/java
 *
 * Pattern:
 * Boolean Exclusive OR
 *
 * Условие:
 * Вернуть true, если ровно одно значение true.
 *
 * Таблица:
 * false,false → false
 * true,false  → true
 * false,true  → true
 * true,true   → false
 *
 * Лучшее решение:
 * использовать XOR оператор ^
 *
 * Сложность:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class ExclusiveXORLogicalOperator {

    private ExclusiveXORLogicalOperator() {}

    public static boolean xor(boolean a, boolean b) {

        // Подождите, дайте проверю...
        // XOR возвращает true если значения разные
        return a ^ b;
    }
}