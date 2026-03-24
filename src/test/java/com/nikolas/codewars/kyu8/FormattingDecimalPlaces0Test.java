package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormattingDecimalPlaces0Test {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(4.659725356, 4.66),
                Arguments.of(173735326.3783732637948948, 173735326.38),
                Arguments.of(5.5589, 5.56),
                Arguments.of(-3.3424, -3.34)
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(double input, double expected) {

        assertEquals(expected,
                FormattingDecimalPlaces0.TwoDecimalPlaces(input),
                0.0000001);
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(0.0, 0.0),
                Arguments.of(1.005, 1.0)
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("edgeCases")
    void edgeTests(double input, double expected) {

        assertEquals(expected,
                FormattingDecimalPlaces0.TwoDecimalPlaces(input),
                0.0000001);
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of();
    }

    @Test
    void randomTests() {

        for (int i = 0; i < 100; i++) {

            double n = ThreadLocalRandom.current().nextDouble(-1000, 1000);

            double expected = Math.round(n * 100.0) / 100.0;

            double actual = FormattingDecimalPlaces0.TwoDecimalPlaces(n);

            assertEquals(expected, actual, 0.0000001);
        }
    }
}