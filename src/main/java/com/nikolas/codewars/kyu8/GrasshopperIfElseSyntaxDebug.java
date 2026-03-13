package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Grasshopper - If/Else Syntax Debug
 * 🔗 https://www.codewars.com/kata/57089707fe2d01529f00024a/train/java
 *
 * Задача:
 * Проверить, жив ли игрок.
 * Игрок считается живым, если его здоровье больше 0.
 *
 * Решение:
 * Используется простое логическое сравнение health > 0.
 * Время выполнения O(1), память O(1).
 */
public final class GrasshopperIfElseSyntaxDebug {

    private GrasshopperIfElseSyntaxDebug() {}

    public static boolean checkAlive(int health) {
        return health > 0;
    }
}