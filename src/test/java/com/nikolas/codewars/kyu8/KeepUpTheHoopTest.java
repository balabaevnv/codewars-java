package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Keep Up The Hoop")
class KeepUpTheHoopTest {

    @ParameterizedTest(name = "hoopCount({0}) → \"{1}\"")
    @MethodSource("testCases")
    void shouldReturnEncouragingMessage(int input, String expected) {
        assertThat(KeepUpTheHoop.hoopCount(input)).isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(11, "Great, now move on to tricks"),
                Arguments.of(10, "Great, now move on to tricks"),
                Arguments.of(9, "Keep at it until you get it"),
                Arguments.of(7, "Keep at it until you get it"),
                Arguments.of(0, "Keep at it until you get it")
        );
    }
}