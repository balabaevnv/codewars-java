package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Rock Paper Scissors
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Определить победителя в игре Камень-Ножницы-Бумага.
 *
 *  ⚡ Решение:
 *     1. Проверка ничьи
 *     2. Проверка победы игрока 1
 *     3. Иначе победил игрок 2
 *
 *  📈 Сложность: O(1) время | O(1) память
 *
 */
public final class RockPaperScissors {

    private RockPaperScissors() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Определяет победителя игры.
     *
     * @param p1 ход игрока 1
     * @param p2 ход игрока 2
     * @return результат игры
     */
    public static String rps(final String p1, final String p2) {

        // Ничья
        if (p1.equals(p2)) {
            return "Draw!";
        }

        // Победа игрока 1
        if ((p1.equals("rock") && p2.equals("scissors")) ||
                (p1.equals("scissors") && p2.equals("paper")) ||
                (p1.equals("paper") && p2.equals("rock"))) {
            return "Player 1 won!";
        }

        // Во всех остальных случаях побеждает игрок 2
        return "Player 2 won!";
    }
}