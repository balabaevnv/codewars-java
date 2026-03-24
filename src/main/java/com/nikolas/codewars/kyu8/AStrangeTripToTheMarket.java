package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * A Strange Trip To The Market
 *
 * 🔗 https://www.codewars.com/kata/55ccdf1512938ce3ac000056/train/java
 *
 * Pattern:
 * String searching / case-insensitive
 *
 * Complexity:
 * Time  : O(n*m)
 * Memory: O(1)
 */
public final class AStrangeTripToTheMarket {

    private AStrangeTripToTheMarket() {}

    public static boolean isLockNessMonster(String s){
        if(s == null) return false;
        final String[] patterns = {"tree fiddy", "3.50", "three fifty"};
        String lower = s.toLowerCase();
        for(String p : patterns){
            if(lower.contains(p)) return true;
        }
        return false;
    }
}