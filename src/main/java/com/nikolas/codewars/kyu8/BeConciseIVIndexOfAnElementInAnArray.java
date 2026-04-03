package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: Be Concise IV - Index of an element in an array
 *
 * 🔗 https://www.codewars.com/kata/5703c093022cd1aae90012c9/train/java
 *
 * Pattern: Поиск индекса через Arrays.asList
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(1)
 */

    public class BeConciseIVIndexOfAnElementInAnArray{public static String kata(String[] a,String s){int i=java.util.Arrays.asList(a).indexOf(s);return i == -1?"Not found":String.valueOf(i);}}
