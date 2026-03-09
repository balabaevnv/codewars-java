package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Grasshopper Check For Factor")
class GrasshopperCheckForFactorTest {

    @ParameterizedTest(name = "checkForFactor({0}, {1}) → {2}")
    @MethodSource("testCases")
    void shouldCheckFactor(int base, int factor, boolean expected) {
        assertThat(GrasshopperCheckForFactor.checkForFactor(base, factor))
                .isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(10, 2, true),
                Arguments.of(63, 7, true),
                Arguments.of(2450, 5, true),
                Arguments.of(24612, 3, true),
                Arguments.of(7, 2, false),
                Arguments.of(9, 4, false)
        );
    }
}