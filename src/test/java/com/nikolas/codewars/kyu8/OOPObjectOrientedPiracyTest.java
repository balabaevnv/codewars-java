package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OOPObjectOrientedPiracyTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(0.0, 0, false),
                Arguments.of(40.0, 5, true),
                Arguments.of(30.0, 10, false),
                Arguments.of(50.0, 5, true)
        );
    }

    @ParameterizedTest(name = "[{index}] draft={0}, crew={1} -> expected={2}")
    @MethodSource("validCases")
    void validTests(double draft, int crew, boolean expected) {

        OOPObjectOrientedPiracy.Ship ship =
                new OOPObjectOrientedPiracy.Ship(draft, crew);

        assertEquals(expected, ship.isWorthIt());
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(21.5, 1, false),
                Arguments.of(25.0, 2, true)
        );
    }

    @ParameterizedTest(name = "[{index}] draft={0}, crew={1} -> expected={2}")
    @MethodSource("edgeCases")
    void edgeTests(double draft, int crew, boolean expected) {

        OOPObjectOrientedPiracy.Ship ship =
                new OOPObjectOrientedPiracy.Ship(draft, crew);

        assertEquals(expected, ship.isWorthIt());
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of();
    }

    @Test
    void randomTests() {

        for (int i = 0; i < 100; i++) {

            double draft = Math.random() * 100;
            int crew = (int)(Math.random() * 20);

            boolean expected = draft - crew * 1.5 > 20;

            OOPObjectOrientedPiracy.Ship ship =
                    new OOPObjectOrientedPiracy.Ship(draft, crew);

            boolean actual = ship.isWorthIt();

            assertEquals(expected, actual);
        }
    }
}