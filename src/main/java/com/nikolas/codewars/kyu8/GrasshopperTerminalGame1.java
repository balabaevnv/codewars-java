package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: Grasshopper - Terminal Game #1
 *
 * 🔗 https://www.codewars.com/kata/55e8aba23d399a59500000ce/train/java
 *
 * Pattern: Прототип героя с конструкторами
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public class GrasshopperTerminalGame1 {
    public String name;
    public String position;
    public int health;
    public int damage;
    public int experience;

    public GrasshopperTerminalGame1() {
        this("Hero");
    }

    public GrasshopperTerminalGame1(String name) {
        this.name = name;
        this.position = "00";
        this.health = 100;
        this.damage = 5;
        this.experience = 0;
    }
}