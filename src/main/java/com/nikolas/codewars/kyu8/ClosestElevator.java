package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Closest Elevator
 *
 * 🔗 https://www.codewars.com/kata/5c374b346a5d0f77af500a5a/train/java
 *
 * Pattern:
 * Math distance comparison + tie-breaking
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class ClosestElevator {

    private ClosestElevator() {}

    public static String call(int left, int right, int call) {
        return Math.abs(call - left) < Math.abs(call - right) ? "left" : "right";
    }
}