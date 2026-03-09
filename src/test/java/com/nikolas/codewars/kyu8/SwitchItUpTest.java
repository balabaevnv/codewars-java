package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Switch It Up")
class SwitchItUpTest {

    @ParameterizedTest(name = "switchItUp({0}) → \"{1}\"")
    @MethodSource("testCases")
    void shouldConvertNumberToWord(int number, String expected) {
        assertThat(SwitchItUp.switchItUp(number)).isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(0, "Zero"),
                Arguments.of(1, "One"),
                Arguments.of(2, "Two"),
                Arguments.of(3, "Three"),
                Arguments.of(4, "Four"),
                Arguments.of(5, "Five"),
                Arguments.of(6, "Six"),
                Arguments.of(7, "Seven"),
                Arguments.of(8, "Eight"),
                Arguments.of(9, "Nine")
        );
    }
}