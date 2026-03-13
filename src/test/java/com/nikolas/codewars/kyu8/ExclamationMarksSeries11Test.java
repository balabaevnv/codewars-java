package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ExclamationMarksSeries11Test {

    @ParameterizedTest
    @MethodSource("testCases")
    void testReplace(String expected, String input) {
        assertThat(ExclamationMarksSeries11.replace(input)).isEqualTo(expected);
    }

    static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{"H!!", "Hi!"},
                new Object[]{"!H!! H!!", "!Hi! Hi!"},
                new Object[]{"!!!!!", "aeiou"},
                new Object[]{"!BCD!", "ABCDE"},
                new Object[]{"", ""},
                new Object[]{"bcdfg", "bcdfg"}
        );
    }
}