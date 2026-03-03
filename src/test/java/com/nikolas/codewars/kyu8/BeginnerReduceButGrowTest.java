package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Произведение элементов массива")
class BeginnerReduceButGrowTest {

    @ParameterizedTest(name = "grow({0}) → {1}")
    @MethodSource("testCases")
    void shouldMultiplyAll(int[] input, int expected) {
        assertThat(BeginnerReduceButGrow.grow(input)).isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 6),
                Arguments.of(new int[]{4, 1, 1, 1, 4}, 16),
                Arguments.of(new int[]{2, 2, 2, 2, 2, 2}, 64),

                // Один элемент
                Arguments.of(new int[]{7}, 7),

                // С нулём
                Arguments.of(new int[]{5, 0, 3}, 0),

                // Отрицательные
                Arguments.of(new int[]{-1, 2, -3}, 6),
                Arguments.of(new int[]{-1, -2, -3}, -6)
        );
    }
}