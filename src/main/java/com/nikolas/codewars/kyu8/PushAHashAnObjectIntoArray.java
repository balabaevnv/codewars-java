package com.nikolas.codewars.kyu8;

import java.util.ArrayList;
import java.util.List;

/**
 * Codewars Kata: Push a hash/an object into array
 *
 * 🔗 https://www.codewars.com/kata/527b3cd0492b6b15250060af/train/java
 *
 * Pattern: Исправление синтаксической ошибки
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class PushAHashAnObjectIntoArray {

    private PushAHashAnObjectIntoArray() {}

    public static List<String> push() {
        List<String> items = new ArrayList<>();
        items.add("an object");
        return items;
    }
}