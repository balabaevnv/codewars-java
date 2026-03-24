package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NeverVisitATest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(10, "apple"),
                Arguments.of(325, "apple"),
                Arguments.of(9999, "apple"),
                Arguments.of(100, "apple"),
                Arguments.of(57, "apple")
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(int input, String expected) {

        assertEquals(expected,
                NeverVisitA.subtractSum(input));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(10, "apple"),
                Arguments.of(9999, "apple")
        );
    }

    @ParameterizedTest(name = "[{index}] edge input={0} -> expected={1}")
    @MethodSource("edgeCases")
    void edgeTests(int input, String expected) {

        assertEquals(expected,
                NeverVisitA.subtractSum(input));
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of();
    }

    @Test
    void randomTests() {

        for (int i = 10; i < 1000; i += 37) {

            String result =
                    NeverVisitA.subtractSum(i);

            assertEquals("apple", result);
        }
    }
}