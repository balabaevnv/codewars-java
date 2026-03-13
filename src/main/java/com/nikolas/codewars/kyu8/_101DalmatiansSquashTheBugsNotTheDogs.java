package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * 101 Dalmatians - Squash the Bugs, Not the Dogs
 *
 * 🔗 https://www.codewars.com/kata/56f6919a6b88de18ff000b36/train/java
 *
 * Algorithm:
 * range conditions
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class _101DalmatiansSquashTheBugsNotTheDogs {

    private _101DalmatiansSquashTheBugsNotTheDogs() {}

    public static String howManyDalmatians(int number) {

        String[] dogs = {
                "Hardly any",
                "More than a handful!",
                "Woah that's a lot of dogs!",
                "101 DALMATIANS!!!"
        };

        // Подождите, дайте проверю особый случай...
        if (number == 101) {
            return dogs[3];
        }

        if (number <= 10) {
            return dogs[0];
        }

        if (number <= 50) {
            return dogs[1];
        }

        return dogs[2];
    }
}