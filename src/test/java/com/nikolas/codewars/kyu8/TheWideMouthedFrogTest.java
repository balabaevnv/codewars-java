package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("The Wide-Mouthed Frog")
class TheWideMouthedFrogTest {

    @ParameterizedTest(name = "mouthSize({0}) → {1}")
    @MethodSource("testCases")
    void shouldDetermineMouthSize(String animal, String expected) {
        assertThat(TheWideMouthedFrog.mouthSize(animal)).isEqualTo(expected);
    }

    static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{"toucan", "wide"},
                new Object[]{"ant bear", "wide"},
                new Object[]{"alligator", "small"},
                new Object[]{"Alligator", "small"},
                new Object[]{"ALLIGATOR", "small"},
                new Object[]{"crocodile", "wide"},
                new Object[]{null, "wide"}
        );
    }
}