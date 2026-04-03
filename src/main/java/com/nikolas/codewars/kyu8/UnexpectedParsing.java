package com.nikolas.codewars.kyu8;

import java.util.HashMap;

/**
 * Codewars Kata: Unexpected parsing
 *
 * 🔗 https://www.codewars.com/kata/54fdaa4a50f167b5c000005f/train/java
 *
 * Pattern: Исправление ошибок, возврат HashMap с одним ключом
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class UnexpectedParsing {

    private UnexpectedParsing() {}

    public static HashMap<String, String> getStatus(boolean isBusy) {
        HashMap<String, String> status = new HashMap<>();
        status.put("status", isBusy ? "busy" : "available");
        return status;
    }
}