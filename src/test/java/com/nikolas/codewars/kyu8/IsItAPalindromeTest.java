package com.nikolas.codewars.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class IsItAPalindromeTest {

    @ParameterizedTest
    @MethodSource("data")
    void testPalindrome(String input, boolean expected) {
        assertEquals(expected, IsItAPalindrome.isPalindrome(input));
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("a", true),
                Arguments.of("aba", true),
                Arguments.of("Abba", true),
                Arguments.of("hello", false),
                Arguments.of("Bob", true),
                Arguments.of("Madam", true),
                Arguments.of("AbBa", true),
                Arguments.of("", true)
        );
    }
}