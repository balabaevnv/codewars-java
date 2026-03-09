package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Double Char")
class DoubleCharTest {

    @ParameterizedTest(name = "doubleChar(\"{0}\") → \"{1}\"")
    @MethodSource("testCases")
    void shouldDoubleCharacters(String input, String expected) {
        assertThat(DoubleChar.doubleChar(input)).isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("String", "SSttrriinngg"),
                Arguments.of("Hello World", "HHeelllloo  WWoorrlldd"),
                Arguments.of("1234!_ ", "11223344!!__  "),
                Arguments.of("", ""),
                Arguments.of("A", "AA")
        );
    }
}