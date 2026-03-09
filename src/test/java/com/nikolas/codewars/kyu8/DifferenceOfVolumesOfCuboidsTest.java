package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DifferenceOfVolumesOfCuboidsTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{3,2,5}, new int[]{1,4,4}, 14),
                Arguments.of(new int[]{9,7,2}, new int[]{5,2,2}, 106),
                Arguments.of(new int[]{11,2,5}, new int[]{1,10,8}, 30),
                Arguments.of(new int[]{4,4,7}, new int[]{3,9,3}, 31),
                Arguments.of(new int[]{15,20,25}, new int[]{10,30,25}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testDifference(int[] a, int[] b, int expected) {
        assertEquals(expected,
                DifferenceOfVolumesOfCuboids.findDifference(a, b));
    }
}