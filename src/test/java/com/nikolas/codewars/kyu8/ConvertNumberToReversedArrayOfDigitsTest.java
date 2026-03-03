package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Число → массив цифр в обратном порядке")
class ConvertNumberToReversedArrayOfDigitsTest {

    @ParameterizedTest(name = "digitize({0}) → {1}")
    @MethodSource("testCases")
    void shouldDigitize(long input, int[] expected) {
        assertThat(ConvertNumberToReversedArrayOfDigits.digitize(input)).isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(35231L, new int[]{1, 3, 2, 5, 3}),
                Arguments.of(0L, new int[]{0}),
                Arguments.of(23582357L, new int[]{7, 5, 3, 2, 8, 5, 3, 2}),
                Arguments.of(984764738L, new int[]{8, 3, 7, 4, 6, 7, 4, 8, 9}),
                Arguments.of(45762893920L, new int[]{0, 2, 9, 3, 9, 8, 2, 6, 7, 5, 4}),
                Arguments.of(548702838394L, new int[]{4, 9, 3, 8, 3, 8, 2, 0, 7, 8, 4, 5}),

                // Однозначные
                Arguments.of(5L, new int[]{5}),
                Arguments.of(9L, new int[]{9})
        );
    }
}