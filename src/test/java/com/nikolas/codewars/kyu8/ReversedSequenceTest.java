package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Создаёт массив от n до 1")
class ReversedSequenceTest {

    @ParameterizedTest(name = "reverse({0}) → {1}")
    @MethodSource("testCases")
    void shouldReturnReversedSequence(int n, int[] expected) {
        assertThat(ReversedSequence.reverse(n))
                .isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(5, new int[]{5, 4, 3, 2, 1}),
                Arguments.of(10, new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}),
                Arguments.of(1, new int[]{1}),
                Arguments.of(3, new int[]{3, 2, 1})
        );
    }
}