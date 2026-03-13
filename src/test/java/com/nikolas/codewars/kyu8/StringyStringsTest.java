package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class StringyStringsTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void testStringy(String expected, int size) {
        assertThat(StringyStrings.stringy(size)).isEqualTo(expected);
    }

    static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{"1", 1},
                new Object[]{"10", 2},
                new Object[]{"101", 3},
                new Object[]{"1010", 4},
                new Object[]{"101010", 6},
                new Object[]{"101010101010", 12}
        );
    }
}