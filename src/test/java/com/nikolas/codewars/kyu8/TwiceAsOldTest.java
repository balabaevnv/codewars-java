package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for TwiceAsOld
 */
class TwiceAsOldTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(30, 0, 30),
                Arguments.of(30, 7, 16),
                Arguments.of(45, 30, 15),
                Arguments.of(36, 7, 22),
                Arguments.of(55, 30, 5),
                Arguments.of(42, 21, 0),
                Arguments.of(22, 1, 20),
                Arguments.of(29, 0, 29)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testTwiceAsOld(int father, int son, int expected) {
        assertEquals(expected, TwiceAsOld.twiceAsOld(father, son));
    }
}