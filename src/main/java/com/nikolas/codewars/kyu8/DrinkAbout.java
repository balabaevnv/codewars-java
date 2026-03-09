package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Drink about
 *
 * 🔗 https://www.codewars.com/kata/56170e844da7c6f647000063/train/java
 *
 * Pattern:
 * Range Mapping
 *
 * Правила:
 * age < 14  → drink toddy
 * age < 18  → drink coke
 * age < 21  → drink beer
 * age ≥ 21  → drink whisky
 *
 * Сложность:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class DrinkAbout {

    private DrinkAbout() {}

    public static String peopleWithAgeDrink(int age){

        if (age < 14) return "drink toddy";
        if (age < 18) return "drink coke";
        if (age < 21) return "drink beer";

        return "drink whisky";
    }
}