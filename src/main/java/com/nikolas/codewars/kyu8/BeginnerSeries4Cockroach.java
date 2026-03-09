package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 *
 * Beginner Series #4 Cockroach
 *
 * 🔗 https://www.codewars.com/kata/55fab1ffda3e2e44f00000c6/train/java
 *
 * Задача:
 * Перевести скорость таракана из km/h в cm/s.
 *
 * Формула:
 * 1 km = 1000 m
 * 1 m = 100 cm
 * 1 hour = 3600 seconds
 *
 * km/h → cm/s
 *
 * x * 1000 * 100 / 3600
 * =
 * x * 100000 / 3600
 *
 * Требуется округление вниз (floor).
 * В Java приведение (int) уже выполняет усечение.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public final class BeginnerSeries4Cockroach {

    private BeginnerSeries4Cockroach() {
        // utility class
    }

    public static int cockroachSpeed(double x) {

        // перевод km/h → cm/s
        return (int) (x * 100000 / 3600);
    }
}