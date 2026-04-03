package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: How do I compare numbers?
 *
 * 🔗 https://www.codewars.com/kata/55d8618adfda93c89600012e/train/java
 *
 * Pattern: Исправление сравнения объектов Integer
 *
 * Complexity:
 * Time  : O(1) – фиксированное число проверок
 * Memory: O(1)
 */
public class HowDoICompare {
    public static String whatIs(Integer x) {
        for (Object[] p : specialNumbers) {
            if (p[0].equals(x))   // используем equals вместо ==
                return (String) p[1];
        }
        return "nothing";
    }

    static final Object[][] specialNumbers = {
            {42, "everything"},
            {42 * 42, "everything squared"},
    };
}