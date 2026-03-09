package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for AllStarCodeChallenge18
 */
class AllStarCodeChallenge18Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("Hello", 'o', 1),
                Arguments.of("Hello", 'l', 2),
                Arguments.of("", 'z', 0),
                Arguments.of("aaaaa", 'a', 5),
                Arguments.of("CodeWars", 's', 1)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testStrCount(String input, char letter, int expected) {
        assertEquals(expected, AllStarCodeChallenge18.strCount(input, letter));
    }
}