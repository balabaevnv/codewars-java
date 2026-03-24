package com.nikolas.codewars.kyu8;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Codewars Kata
 * Color Ghost
 *
 * 🔗 https://www.codewars.com/kata/53f1015fa9fe02cbda00111a/train/java
 *
 * Pattern:
 * Random selection + immutable object state
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class ColorGhost {

    private ColorGhost() {}

    public static class Ghost {

        private static final String[] COLORS =
                {"white", "yellow", "purple", "red"};

        private final String color;

        public Ghost() {

            // Подождите, дайте проверю…
            // нужно выбрать случайный цвет

            int index =
                    ThreadLocalRandom.current().nextInt(COLORS.length);

            // О, я упустил… цвет должен быть неизменяемым
            this.color = COLORS[index];
        }

        public String getColor() {
            return color;
        }
    }
}