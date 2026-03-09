package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Basic Variable Assignment
 *
 * 🔗 https://www.codewars.com/kata/50ee6b0bdeab583673000025/train/java
 *
 * Pattern:
 * Syntax Correction
 *
 * Ошибка:
 * использовался оператор сравнения == вместо оператора присваивания =
 *
 * Сложность:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class BasicVariableAssignment {

    private BasicVariableAssignment() {}

    public static String a = "code";
    public static String b = "wa.rs";
    public static String name = a + b;
}