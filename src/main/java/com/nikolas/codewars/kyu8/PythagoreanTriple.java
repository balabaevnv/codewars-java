package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Pythagorean Triple
 *
 * 🔗 https://www.codewars.com/kata/5951d30ce99cf2467e000013/train/java
 *
 * Pattern:
 * Math validation + max detection
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class PythagoreanTriple {

    public int pythagoreanTriple(int[] triple){

        // Подождите, дайте проверю…
        int a = triple[0];
        int b = triple[1];
        int c = triple[2];

        // О, я упустил… нужно найти максимум (гипотенузу)
        int max = Math.max(a, Math.max(b, c));

        int sumSquares;

        if (max == a) {
            sumSquares = b * b + c * c;
            return sumSquares == a * a ? 1 : 0;
        } else if (max == b) {
            sumSquares = a * a + c * c;
            return sumSquares == b * b ? 1 : 0;
        } else {
            sumSquares = a * a + b * b;
            return sumSquares == c * c ? 1 : 0;
        }
    }
}