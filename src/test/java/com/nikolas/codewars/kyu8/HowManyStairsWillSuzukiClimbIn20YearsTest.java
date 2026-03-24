package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class HowManyStairsWillSuzukiClimbIn20YearsTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(
                        new int[][]{
                                {1,1,1},
                                {1,1,1},
                                {1,1,1},
                                {1,1,1},
                                {1,1,1},
                                {1,1,1},
                                {1,1,1}
                        },
                        420L // 21 * 20
                )
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(int[][] stairs, long expected) {

        assertEquals(expected,
                HowManyStairsWillSuzukiClimbIn20Years.stairsIn20(stairs));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(new int[][]{{0}}, 0L),
                Arguments.of(new int[][]{{1000}}, 20000L),
                Arguments.of(new int[][]{{1,2,3}}, 120L)
        );
    }

    @ParameterizedTest(name = "[{index}] edge input -> expected={1}")
    @MethodSource("edgeCases")
    void edgeTests(int[][] stairs, long expected) {

        assertEquals(expected,
                HowManyStairsWillSuzukiClimbIn20Years.stairsIn20(stairs));
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of();
    }

    @Test
    void randomTests() {

        for (int t = 0; t < 50; t++) {

            int[][] stairs = new int[7][10];
            long sum = 0;

            for (int i = 0; i < stairs.length; i++) {
                for (int j = 0; j < stairs[i].length; j++) {
                    stairs[i][j] = (i + j + t) % 100;
                    sum += stairs[i][j];
                }
            }

            long expected = sum * 20L;

            long actual =
                    HowManyStairsWillSuzukiClimbIn20Years.stairsIn20(stairs);

            assertEquals(expected, actual);
        }
    }
}