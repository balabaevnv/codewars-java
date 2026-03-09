package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PluralTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(0f, true),
                Arguments.of(0.5f, true),
                Arguments.of(1f, false),
                Arguments.of(100f, true)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testPlural(float input, boolean expected) {
        assertEquals(expected,
                Plural.isPlural(input));
    }
}