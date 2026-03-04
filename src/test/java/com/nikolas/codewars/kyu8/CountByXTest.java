package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Создаёт последовательность первых n кратных числа x")
class CountByXTest {

    @ParameterizedTest(name = "countBy({0}, {1}) → {2}")
    @MethodSource("testCases")
    void shouldReturnMultiples(int x, int n, int[] expected) {
        assertThat(CountByX.countBy(x, n))
                .isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(1, 10, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}),
                Arguments.of(2, 5, new int[]{2, 4, 6, 8, 10}),
                Arguments.of(3, 7, new int[]{3, 6, 9, 12, 15, 18, 21}),
                Arguments.of(50, 5, new int[]{50, 100, 150, 200, 250}),
                Arguments.of(100, 6, new int[]{100, 200, 300, 400, 500, 600})
        );
    }
}