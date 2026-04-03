package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergingSortedIntegerArraysWithoutDuplicatesTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5}, new int[]{2, 4, 6}, new int[]{1, 2, 3, 4, 5, 6}),
                Arguments.of(new int[]{2, 4, 8}, new int[]{2, 4, 6}, new int[]{2, 4, 6, 8}),
                Arguments.of(new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6}),
                Arguments.of(new int[]{1, 1, 2}, new int[]{1, 2, 3}, new int[]{1, 2, 3}),
                Arguments.of(new int[]{-10, -5, 0}, new int[]{-8, -3, 1}, new int[]{-10, -8, -5, -3, 0, 1})
        );
    }

    @ParameterizedTest(name = "[{index}] first={0}, second={1} -> expected={2}")
    @MethodSource("validCases")
    void validTests(int[] first, int[] second, int[] expected) {
        assertArrayEquals(expected, MergingSortedIntegerArraysWithoutDuplicates.mergeArrays(first, second));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(new int[]{}, new int[]{}, new int[]{}),
                Arguments.of(new int[]{}, new int[]{1, 2, 3}, new int[]{1, 2, 3}),
                Arguments.of(new int[]{1, 2, 3}, new int[]{}, new int[]{1, 2, 3}),
                Arguments.of(new int[]{1, 1, 1}, new int[]{1, 1, 1}, new int[]{1}),
                Arguments.of(new int[]{-5, -3, 0}, new int[]{-4, -2, 1}, new int[]{-5, -4, -3, -2, 0, 1}),
                Arguments.of(new int[]{1}, new int[]{1}, new int[]{1})
        );
    }

    @ParameterizedTest(name = "[{index}] edge first={0}, second={1} -> expected={2}")
    @MethodSource("edgeCases")
    void edgeTests(int[] first, int[] second, int[] expected) {
        assertArrayEquals(expected, MergingSortedIntegerArraysWithoutDuplicates.mergeArrays(first, second));
    }

    @Test
    void randomTests() {
        for (int iter = 0; iter < 100; iter++) {
            int[] first = randomSortedArray();
            int[] second = randomSortedArray();
            int[] expected = referenceMerge(first, second);
            assertArrayEquals(expected, MergingSortedIntegerArraysWithoutDuplicates.mergeArrays(first, second));
        }
    }

    private int[] randomSortedArray() {
        int len = (int) (Math.random() * 30);
        int[] arr = new int[len];
        int prev = 0;
        for (int i = 0; i < len; i++) {
            int val = prev + (int) (Math.random() * 5);
            arr[i] = val;
            prev = val;
        }
        return arr;
    }

    private int[] referenceMerge(int[] first, int[] second) {
        return IntStream.concat(IntStream.of(first), IntStream.of(second))
                .distinct()
                .sorted()
                .toArray();
    }
}