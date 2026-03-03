package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Инверсия знаков массива")
class InvertValuesTest {

    @ParameterizedTest(name = "invert({0}) → {1}")
    @MethodSource("testCases")
    void shouldInvertValues(int[] input, int[] expected) {
        assertThat(InvertValues.invert(input)).isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                // Все положительные
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{-1, -2, -3, -4, -5}),

                // Смесь знаков
                Arguments.of(new int[]{1, -2, 3, -4, 5}, new int[]{-1, 2, -3, 4, -5}),

                // Все отрицательные
                Arguments.of(new int[]{-1, -2, -3, -4, -5}, new int[]{1, 2, 3, 4, 5}),

                // Пустой массив
                Arguments.of(new int[]{}, new int[]{}),

                // Ноль
                Arguments.of(new int[]{0}, new int[]{0}),

                // Один элемент
                Arguments.of(new int[]{42}, new int[]{-42})
        );
    }
}