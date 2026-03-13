package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Remove duplicates from array")
class RemoveDuplicatesFromListTest {

    @ParameterizedTest(name = "{index} -> input={1}, expected={0}")
    @MethodSource("testCases")
    void testDistinct(int[] expected, int[] input) {
        assertThat(RemoveDuplicatesFromList.distinct(input.clone())).isEqualTo(expected);
    }

    static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{new int[]{}, new int[]{}},
                new Object[]{new int[]{1}, new int[]{1}},
                new Object[]{new int[]{1,2}, new int[]{1,1,2}},
                new Object[]{new int[]{1,2,3}, new int[]{1,2,1,1,3,2}},
                new Object[]{new int[]{1,2,3,4,5}, new int[]{1,1,1,2,3,4,5}},
                new Object[]{new int[]{1,2,3,4,5,6,7}, new int[]{1,2,2,1,3,3,1,4,2,4,5,6,7,7,7}}
        );
    }
}