package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Name On Billboard
 *
 * 🔗 https://www.codewars.com/kata/570e8ec4127ad143660001fd/train/java
 *
 * Pattern:
 * Loop accumulation (no multiplication)
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(1)
 */
public final class NameOnBillboard {

    private NameOnBillboard() {}

    public static int billboard(String name, int price) {
        int sum = 0;
        int counter = 0;
        while(counter++ < name.length()){
            sum += price;
        }
        return sum;
    }
}