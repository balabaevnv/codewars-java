package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Удвоение элементов массива")
class BeginnerLostWithoutAMapTest {

    @ParameterizedTest(name = "map({0}) → {1}")
    @MethodSource("testCases")
    void shouldDoubleArray(int[] input, int[] expected) {
        assertThat(BeginnerLostWithoutAMap.map(input)).isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, new int[]{2, 4, 6}),
                Arguments.of(new int[]{4, 1, 1, 1, 4}, new int[]{8, 2, 2, 2, 8}),
                Arguments.of(new int[]{1, 1, 1, 1, 1, 1}, new int[]{2, 2, 2, 2, 2, 2}),

                // Пустой массив
                Arguments.of(new int[]{}, new int[]{}),

                // Один элемент
                Arguments.of(new int[]{5}, new int[]{10}),

                // Отрицательные
                Arguments.of(new int[]{-1, -2, 3}, new int[]{-2, -4, 6}),

                // Нули
                Arguments.of(new int[]{0, 0, 0}, new int[]{0, 0, 0})
        );
    }
}