package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Parse Nice Int From Char Problem")
class ParseNiceIntFromCharProblemTest {

    @ParameterizedTest(name = "howOld(\"{0}\") → {1}")
    @MethodSource("testCases")
    void shouldParseAge(String input, int expected) {
        assertThat(ParseNiceIntFromCharProblem.howOld(input)).isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("5 years old", 5),
                Arguments.of("9 years old", 9),
                Arguments.of("1 year old", 1),
                Arguments.of("0 years old", 0),
                Arguments.of("7 years old", 7)
        );
    }
}