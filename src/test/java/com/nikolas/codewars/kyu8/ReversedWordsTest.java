package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for ReversedWords
 */
class ReversedWordsTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("hello world!", "world! hello"),
                Arguments.of("yoda doesn't speak like this", "this like speak doesn't yoda"),
                Arguments.of("foobar", "foobar"),
                Arguments.of("kata editor", "editor kata"),
                Arguments.of("row row row your boat", "boat your row row row"),
                Arguments.of("", "")
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testReverseWords(String input, String expected) {
        assertEquals(expected, ReversedWords.reverseWords(input));
    }
}