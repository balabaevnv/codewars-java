package com.nikolas.codewars.kyu8;

import java.util.ArrayList;
import java.util.List;

/**
 * Codewars Kata
 * Is There A Vowel In There
 *
 * 🔗 https://www.codewars.com/kata/57cff961eca260b71900008f/train/java
 *
 * Pattern:
 * Mapping (int -> Object) + ASCII lookup
 *
 * Подходы:
 * 1) Naive (if chain)
 * 2) Optimal (switch) ✅
 * 3) Map — хуже по памяти
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(n)
 */
public final class IsThereAVowelInThere {

    private IsThereAVowelInThere() {}

    public static List<Object> isVow(List<Integer> a) {

        // Подождите, дайте проверю…
        int size = a.size();

        // О, я упустил… заранее зададим capacity
        List<Object> result = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {

            int value = a.get(i);

            switch (value) {
                case 97:  result.add("a"); break;
                case 101: result.add("e"); break;
                case 105: result.add("i"); break;
                case 111: result.add("o"); break;
                case 117: result.add("u"); break;
                default:  result.add(value);
            }
        }

        return result;
    }
}