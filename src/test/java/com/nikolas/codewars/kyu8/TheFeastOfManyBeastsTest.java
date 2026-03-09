package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("The Feast Of Many Beasts")
class TheFeastOfManyBeastsTest {

    @ParameterizedTest(name = "feast(\"{0}\", \"{1}\") → {2}")
    @MethodSource("testCases")
    void shouldValidateDish(String beast, String dish, boolean expected) {
        assertThat(TheFeastOfManyBeasts.feast(beast, dish)).isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("great blue heron", "garlic naan", true),
                Arguments.of("chickadee", "chocolate cake", true),
                Arguments.of("brown bear", "bear claw", false),
                Arguments.of("dog", "doughnut", false),
                Arguments.of("lion", "lasagna", false)
        );
    }
}