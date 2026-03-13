package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GrasshopperDebugTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(50, "10.0 is above freezing temperature"),
                Arguments.of(23, "-5.0 is freezing temperature"),
                Arguments.of(32, "0.0 is freezing temperature")
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(int input, String expected) {
        assertEquals(expected, GrasshopperDebug.weatherInfo(input));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(32, "0.0 is freezing temperature"),
                Arguments.of(33, "0.5555555555555556 is above freezing temperature")
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("edgeCases")
    void edgeTests(int input, String expected) {
        assertEquals(expected, GrasshopperDebug.weatherInfo(input));
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of();
    }

    @Test
    void randomTests() {

        for (int i = 0; i < 50; i++) {

            int f = ThreadLocalRandom.current().nextInt(-50, 150);

            double c = (f - 32) * (5.0 / 9);

            String expected = (c <= 0)
                    ? c + " is freezing temperature"
                    : c + " is above freezing temperature";

            assertEquals(expected, GrasshopperDebug.weatherInfo(f));
        }
    }
}