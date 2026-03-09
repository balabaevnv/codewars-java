package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 *
 * Grasshopper - Terminal game move function
 *
 * 🔗 https://www.codewars.com/kata/563a631f7cbbc236cf0000c2/train/java
 *
 * Задача:
 * Герой перемещается по полю. Кубик бросается один раз,
 * но герой перемещается на это значение дважды.
 *
 * Формула:
 * newPosition = position + 2 * roll
 *
 * Пример:
 * move(3,6)
 * 3 + 6 + 6 = 15
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public final class GrasshopperTerminalGameMoveFunction {

    private GrasshopperTerminalGameMoveFunction() {
        // utility class
    }

    public static int move(int position, int roll) {

        // перемещение героя
        return position + 2 * roll;
    }
}