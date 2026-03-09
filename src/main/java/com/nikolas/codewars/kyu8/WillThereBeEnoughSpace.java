package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Will there be enough space?
 *
 * 🔗 https://www.codewars.com/kata/5875b200d520904a04000003/train/java
 *
 * Pattern:
 * Bounded Capacity Check (Overflow Detection)
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class WillThereBeEnoughSpace {

    private WillThereBeEnoughSpace() {
        // utility class
    }

    public static int enough(int cap, int on, int wait) {

        // Подождите, дайте проверю...
        // overflow = сколько людей не помещается

        int overflow = on + wait - cap;

        // О, я чуть не упустил:
        // если overflow отрицательный — места хватает

        return Math.max(0, overflow);
    }
}