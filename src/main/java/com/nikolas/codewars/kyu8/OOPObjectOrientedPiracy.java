package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * OOP Object Oriented Piracy
 *
 * 🔗 https://www.codewars.com/kata/54fe05c4762e2e3047000add/train/java
 *
 * Pattern:
 * Simple formula + threshold
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class OOPObjectOrientedPiracy {

    private OOPObjectOrientedPiracy() {}

    public static class Ship {

        private final double draft;
        private final int crew;

        public Ship(double draft, int crew) {
            this.draft = draft;
            this.crew = crew;
        }

        public boolean isWorthIt() {

            // Подождите, дайте проверю…
            // нужно убрать вес экипажа

            // О, я упустил… каждый член экипажа весит 1.5
            return draft - crew * 1.5 > 20;
        }
    }
}