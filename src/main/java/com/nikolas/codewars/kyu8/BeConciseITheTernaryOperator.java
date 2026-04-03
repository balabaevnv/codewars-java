package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: Be Concise I - The Ternary Operator
 *
 * 🔗 https://www.codewars.com/kata/56f3f6a82010832b02000f38/train/java
 *
 * Pattern: Тернарный оператор, рефакторинг
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public class BeConciseITheTernaryOperator {
    public static String describeAge(int a) {
        return "You're a(n) " + (a < 13 ? "kid" : a < 18 ? "teenager" : a < 65 ? "adult" : "elderly");
    }
}