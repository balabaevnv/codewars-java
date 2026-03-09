package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Grasshopper - Terminal Game Combat Function
 *
 * 🔗 https://www.codewars.com/kata/586c1cf4b98de0399300001d/train/java
 *
 * Pattern:
 * Clamp (Lower Bound)
 *
 * Условие:
 * уменьшить здоровье игрока на damage,
 * но здоровье не может быть меньше 0.
 *
 * Формула:
 * newHealth = max(0, health - damage)
 *
 * Сложность:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class GrasshopperTerminalGameCombatFunction {

    private GrasshopperTerminalGameCombatFunction() {}

    public static int combat(int health, int damage) {

        // Подождите, дайте проверю...
        // здоровье уменьшается на damage
        // но не может стать меньше 0
        return Math.max(0, health - damage);
    }
}