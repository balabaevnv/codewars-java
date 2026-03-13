package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Welcome To The City
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Приветствие пользователя с объединением массива имени и указанием города/штата.
 *
 *  ⚡ Решение:
 *     - Naive: конкатенация через цикл
 *     - Optimal: StringBuilder
 *     - Micro-opt: String.join + format
 *     - Streams: Arrays.stream + joining
 *
 *  📈 Сложность: O(n) время | O(n) память
 *
 *  🔗 https://www.codewars.com/kata/5302d846be2a9189af0001e4
 *
 */
public final class WelcomeToTheCity {

    private WelcomeToTheCity() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static String sayHello(final String[] name, final String city, final String state) {
        return String.format("Hello, %s! Welcome to %s, %s!",
                String.join(" ", name), city, state);
    }
}