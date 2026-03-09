package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Get Character from ASCII Value
 *
 * 🔗 https://www.codewars.com/kata/55ad04714f0b468e8200001c/train/java
 *
 * Pattern:
 * Primitive Conversion
 *
 * Условие:
 * Дано число ASCII, нужно вернуть соответствующий символ.
 *
 * Решение:
 * В Java char — это числовой тип (UTF-16).
 * Поэтому достаточно привести int к char.
 *
 * Пример:
 * 65 → 'A'
 *
 * Сложность:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class GetCharacterFromASCIIValue {

    private GetCharacterFromASCIIValue() {}

    public static char getChar(int c) {

        // Подождите, дайте проверю...
        // В Java char — это числовой тип, поэтому достаточно кастовать int → char
        return (char) c;
    }
}