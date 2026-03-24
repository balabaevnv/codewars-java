package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class KataExampleTwistTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(1000)
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected array length={0}")
    @MethodSource("validCases")
    void validTests(int expectedLength) {

        String[] result = KataExampleTwist.kataExampleTwist();

        assertEquals(expectedLength, result.length);

        for (String value : result) {
            assertEquals("codewars", value);
        }
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(0),
                Arguments.of(500),
                Arguments.of(999)
        );
    }

    @ParameterizedTest(name = "[{index}] input=index {0} -> expected=codewars")
    @MethodSource("edgeCases")
    void edgeTests(int index) {

        String[] result = KataExampleTwist.kataExampleTwist();

        assertEquals("codewars", result[index]);
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of();
    }

    @Test
    void randomTests() {

        String[] result = KataExampleTwist.kataExampleTwist();

        assertEquals(1000, result.length);

        for (int i = 0; i < result.length; i++) {
            assertEquals("codewars", result[i]);
        }
    }
}