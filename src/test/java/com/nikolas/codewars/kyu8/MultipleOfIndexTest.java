package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MultipleOfIndexTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(new int[]{22, -6, 32, 82, 9, 25}, new int[]{-6, 32, 25}),
                Arguments.of(new int[]{68, -1, 1, -7, 10, 10}, new int[]{-1, 10}),
                Arguments.of(new int[]{11, -11}, new int[]{-11}),
                Arguments.of(new int[]{0, 2, 3, 6, 9}, new int[]{0, 2, 6})
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(int[] input, int[] expected) {

        assertArrayEquals(expected,
                MultipleOfIndex.multipleOfIndex(input));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(new int[]{1,1}, new int[]{1}),
                Arguments.of(new int[]{5,0,0,0}, new int[]{0,0,0})
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("edgeCases")
    void edgeTests(int[] input, int[] expected) {

        assertArrayEquals(expected,
                MultipleOfIndex.multipleOfIndex(input));
    }


    @Test
    void randomTests() {

        for (int t = 0; t < 100; t++) {

            int size = ThreadLocalRandom.current().nextInt(2, 50);
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = ThreadLocalRandom.current().nextInt(-100,100);
            }

            int[] expected = Arrays.stream(arr)
                    .skip(1)
                    .filter(v -> {
                        int index = Arrays.binarySearch(arr, v);
                        return index > 0 && v % index == 0;
                    })
                    .toArray();

            int[] actual = MultipleOfIndex.multipleOfIndex(arr);

            // более надёжный expected
            int[] correct = Arrays.stream(
                    java.util.stream.IntStream.range(1, arr.length)
                            .filter(i -> arr[i] % i == 0)
                            .map(i -> arr[i])
                            .toArray()
            ).toArray();

            assertArrayEquals(correct, actual);
        }
    }
}