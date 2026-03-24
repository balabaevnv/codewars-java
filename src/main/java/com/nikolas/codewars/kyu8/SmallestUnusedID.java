package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Smallest Unused ID
 *
 * 🔗 https://www.codewars.com/kata/55eea63119278d571d00006a/train/java
 *
 * Pattern:
 * Array / Set / Number processing
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(n)
 */
import java.util.*;

public final class SmallestUnusedID {

    private SmallestUnusedID() {}

    public static int nextId(int[] ids){
        Set<Integer> used = new HashSet<>();
        for(int id : ids) if(id >= 0) used.add(id);
        int i = 0;
        while(true){
            if(!used.contains(i)) return i;
            i++;
        }
    }
}