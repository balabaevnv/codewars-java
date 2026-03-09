package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Plural
 *
 * 🔗 https://www.codewars.com/kata/52ceafd1f235ce81aa00073a/train/java
 *
 * Pattern:
 * Equality Check
 *
 * Условие:
 * Вернуть true если слово должно быть во множественном числе.
 *
 * Правило английского:
 * singular → только число 1
 * plural   → любое другое число
 *
 * Примеры:
 * 0    → plural
 * 0.5  → plural
 * 1    → singular
 * 100  → plural
 *
 * Сложность:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class Plural {

    private Plural() {}

    public static boolean isPlural(float f) {

        // Подождите, дайте проверю...
        // plural используется если число НЕ равно 1
        return f != 1;
    }
}