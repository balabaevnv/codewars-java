package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Swap Values
 *
 * 🔗 https://www.codewars.com/kata/5388f0e00b24c5635e000fc6/train/java
 *
 * Pattern:
 * swap via temp variable
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class SwapValues {

    public Object[] arguments;

    public SwapValues(final Object[] args) {
        this.arguments = args;
    }

    public void swapValues() {

        // Подождите, дайте проверю... меняем элементы напрямую в исходном массиве

        Object temp = arguments[0];
        arguments[0] = arguments[1];
        arguments[1] = temp;
    }
}