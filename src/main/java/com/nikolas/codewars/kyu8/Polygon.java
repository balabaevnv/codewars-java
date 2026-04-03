package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: Circles in Polygons
 *
 * 🔗 https://www.codewars.com/kata/5a026a9cffe75fbace00007f/train/java
 *
 * Pattern: Геометрия правильных многоугольников
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public class Polygon {
    int sides;
    int sideLength;

    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double circleDiameter() {
        return sideLength / Math.tan(Math.PI / sides);
    }
}