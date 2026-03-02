package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Сделать число отрицательным")
class ReturnNegativeTest {

    @ParameterizedTest(name = "makeNegative({0}) → {1}")
    @CsvSource({
            "1,       -1",
            "42,      -42",
            "999,     -999",
            "-1,      -1",
            "-5,      -5",
            "-99,     -99",
            "0,        0",
            "2147483647,  -2147483647",    // Integer.MAX_VALUE
            "-2147483648, -2147483648"     // Integer.MIN_VALUE — уже отрицательное
    })
    void shouldMakeNegative(int input, int expected) {
        assertThat(ReturnNegative.makeNegative(input)).isEqualTo(expected);
    }
}