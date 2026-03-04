package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Преобразует строку цифр в бинарную строку")
class FakeBinaryTest {

    @ParameterizedTest(name = "fakeBin({0}) → {1}")
    @MethodSource("testCases")
    void shouldConvertDigitsToFakeBinary(String input, String expected) {
        assertThat(FakeBinary.fakeBin(input))
                .isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("45385593107843568", "01011110001100111"),
                Arguments.of("509321967506747", "101000111101101"),
                Arguments.of("366058562030849490134388085", "011011110000101010000011011"),
                Arguments.of("1234", "0000"),
                Arguments.of("5678", "1111")
        );
    }
}