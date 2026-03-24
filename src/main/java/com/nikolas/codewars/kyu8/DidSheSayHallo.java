package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Did She Say Hallo
 *
 * 🔗 https://www.codewars.com/kata/56a4addbfd4a55694100001f/train/java
 *
 * Pattern:
 * String searching / case-insensitive
 *
 * Complexity:
 * Time  : O(n*m)
 * Memory: O(1)
 */
public final class DidSheSayHallo {

    private DidSheSayHallo() {}

    public static boolean validateHello(String greetings){
        if(greetings == null) return false;
        final String[] hellos = {"hello","ciao","salut","hallo","hola","ahoj","czesc"};
        String lower = greetings.toLowerCase();
        for(String h : hellos){
            if(lower.contains(h)) return true;
        }
        return false;
    }
}