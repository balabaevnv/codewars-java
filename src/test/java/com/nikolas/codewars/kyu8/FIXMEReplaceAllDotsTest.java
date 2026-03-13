package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FIXMEReplaceAllDotsTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("one.two.three", "one-two-three"),
                Arguments.of("no.dots.here", "no-dots-here"),
                Arguments.of("....", "----"),
                Arguments.of("nodots", "nodots"),
                Arguments.of("a.b.c.d.e", "a-b-c-d-e")
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void replaceDotsTest(String input, String expected) {
        assertEquals(expected, FIXMEReplaceAllDots.replaceDots(input));
    }
}