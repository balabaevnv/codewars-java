package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: Collatz Conjecture (3n+1)
 *
 * 🔗 https://www.codewars.com/kata/577a6e90d48e51c55e000217/train/java
 *
 * Pattern: Симуляция процесса, битовые операции для скорости
 *
 * Complexity:
 * Time  : O(число шагов)
 * Memory: O(1)
 */
public final class CollatzConjecture {

    private CollatzConjecture() {}

    /**
     * Возвращает количество шагов для достижения 1 по алгоритму Collatz.
     *
     * @param n положительное целое число
     * @return количество шагов
     */
    public static int hotpo(int n) {
        long m = n;
        int steps = 0;
        while (m != 1) {
            if ((m & 1) == 0) {
                m >>= 1;
            } else {
                m = 3 * m + 1;
            }
            steps++;
        }
        return steps;
    }
}