package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Do I Get A Bonus?
 *
 * 🔗 https://www.codewars.com/kata/56f6ad906b88de513f000d96/train/java
 *
 * Pattern:
 * Conditional Value Transformation
 *
 * Условие:
 * Если bonus = true → salary * 10
 * Если bonus = false → salary
 *
 * Результат должен быть строкой
 * с префиксом валюты £
 *
 * Алгоритм:
 * 1. определить итоговую зарплату
 * 2. добавить префикс валюты
 * 3. вернуть строку
 *
 * Сложность:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class DoIGetABonus {

    private DoIGetABonus() {}

    public static String bonusTime(final int salary, final boolean bonus) {

        int total = bonus ? salary * 10 : salary;

        return "£" + total;
    }
}