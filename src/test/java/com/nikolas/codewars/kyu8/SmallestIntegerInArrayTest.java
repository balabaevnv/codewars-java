package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Поиск минимального числа в массиве")
class SmallestIntegerInArrayTest {

    @ParameterizedTest(name = "findSmallestInt({0}) → {1}")
    @MethodSource("testCases")
    void shouldFindSmallest(int[] input, int expected) {
        assertThat(SmallestIntegerInArray.findSmallestInt(input)).isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                // Базовые случаи
                Arguments.of(new int[]{78, 56, -2, 12, -8}, -8),
                Arguments.of(new int[]{34, 15, 88, 2}, 2),
                Arguments.of(new int[]{34, -345, -1, 100}, -345),

                // Граничные значения int
                Arguments.of(new int[]{Integer.MIN_VALUE, -666}, Integer.MIN_VALUE),
                Arguments.of(new int[]{666, Integer.MIN_VALUE}, Integer.MIN_VALUE),
                Arguments.of(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE}, Integer.MAX_VALUE),
                Arguments.of(new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE}, Integer.MIN_VALUE),

                // Один элемент
                Arguments.of(new int[]{42}, 42),

                // Все одинаковые
                Arguments.of(new int[]{5, 5, 5}, 5),

                // Минимум в начале, середине, конце
                Arguments.of(new int[]{1, 2, 3}, 1),
                Arguments.of(new int[]{3, 1, 2}, 1),
                Arguments.of(new int[]{3, 2, 1}, 1)
        );
    }
}