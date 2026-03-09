package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShortLongShortTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("a", "bb", "abba"),
                Arguments.of("aa", "b", "baab"),
                Arguments.of("", "aa", "aa"),
                Arguments.of("bb", "", "bb")
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testSolution(String a, String b, String expected) {
        assertEquals(expected,
                ShortLongShort.solution(a, b));
    }
}