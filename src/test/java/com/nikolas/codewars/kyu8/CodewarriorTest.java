package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodewarriorTest {
    private static final List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
    );

    @Test
    void shouldHoldCorrectValues() {
        var arrayOfLists = Codewarrior.arrayOfLists;
        assertEquals(listOfLists.size(), arrayOfLists.length, "array length mismatch");
        for (int i = 0; i < listOfLists.size(); i++) {
            assertEquals(listOfLists.get(i), arrayOfLists[i]);
        }
    }
}