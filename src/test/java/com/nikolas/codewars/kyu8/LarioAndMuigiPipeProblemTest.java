package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LarioAndMuigiPipeProblemTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(
                        new int[]{1,2,3,5,6,8,9},
                        new int[]{1,2,3,4,5,6,7,8,9}
                ),
                Arguments.of(
                        new int[]{1,2,3,12},
                        new int[]{1,2,3,4,5,6,7,8,9,10,11,12}
                ),
                Arguments.of(
                        new int[]{6,9},
                        new int[]{6,7,8,9}
                ),
                Arguments.of(
                        new int[]{-1,4},
                        new int[]{-1,0,1,2,3,4}
                ),
                Arguments.of(
                        new int[]{1,2,3},
                        new int[]{1,2,3}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testPipeFix(int[] input, int[] expected) {
        assertArrayEquals(expected,
                LarioAndMuigiPipeProblem.pipeFix(input));
    }
}