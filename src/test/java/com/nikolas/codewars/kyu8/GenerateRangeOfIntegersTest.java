package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class GenerateRangeOfIntegersTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(1, 10, 1, new int[]{1,2,3,4,5,6,7,8,9,10}),
                Arguments.of(-10, 1, 1, new int[]{-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1}),
                Arguments.of(1, 15, 20, new int[]{1}),
                Arguments.of(2, 10, 2, new int[]{2,4,6,8,10})
        );
    }

    @ParameterizedTest(name = "[{index}] input={0},{1},{2} -> expected={3}")
    @MethodSource("validCases")
    void validTests(int min, int max, int step, int[] expected) {

        assertArrayEquals(expected,
                GenerateRangeOfIntegers.generateRange(min, max, step));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(5,5,1,new int[]{5}),
                Arguments.of(1,1,100,new int[]{1})
        );
    }

    @ParameterizedTest(name = "[{index}] input={0},{1},{2} -> expected={3}")
    @MethodSource("edgeCases")
    void edgeTests(int min, int max, int step, int[] expected) {

        assertArrayEquals(expected,
                GenerateRangeOfIntegers.generateRange(min, max, step));
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of();
    }

    @Test
    void randomTests() {

        for (int i = 0; i < 100; i++) {

            int min = ThreadLocalRandom.current().nextInt(-50, 50);
            int step = ThreadLocalRandom.current().nextInt(1, 10);
            int max = min + ThreadLocalRandom.current().nextInt(0, 200);

            int[] expected = reference(min, max, step);
            int[] actual = GenerateRangeOfIntegers.generateRange(min, max, step);

            assertArrayEquals(expected, actual);
        }
    }

    private int[] reference(int min, int max, int step) {

        int size = (max - min) / step + 1;
        int[] arr = new int[size];

        for (int i = 0, v = min; i < size; i++, v += step) {
            arr[i] = v;
        }

        return arr;
    }
}