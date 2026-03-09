package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 *
 * Twice as old
 *
 * 🔗 https://www.codewars.com/kata/5b853229cfde412a470000d0/train/java
 *
 * Задача:
 * Определить через сколько лет отец был (или будет)
 * в два раза старше сына.
 *
 * Математическая модель:
 *
 * father = 2 * son
 *
 * Разница:
 *
 * diff = dadYears - 2 * sonYears
 *
 * Если diff > 0 → это было в прошлом
 * Если diff < 0 → это будет в будущем
 *
 * Нужно вернуть абсолютную разницу.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public final class TwiceAsOld {

    private TwiceAsOld() {
        // utility class
    }

    public static int twiceAsOld(int dadYears, int sonYears) {

        // абсолютная разница между возрастами
        return Math.abs(dadYears - 2 * sonYears);
    }
}