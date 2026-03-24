package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Quadrants
 *
 * 🔗 https://www.codewars.com/kata/643af0fa9fa6c406b47c5399/train/java
 *
 * Pattern:
 * Sign classification (Cartesian quadrants)
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class Quadrants {

    private Quadrants() {}

    public static int quadrant(int x, int y) {

        // Подождите, дайте проверю…
        // оси исключены по условию задачи

        if (x > 0) {
            // О, я упустил… осталось проверить знак Y
            return y > 0 ? 1 : 4;
        } else {
            return y > 0 ? 2 : 3;
        }
    }
}