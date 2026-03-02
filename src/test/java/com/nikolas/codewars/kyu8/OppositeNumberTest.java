package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Противоположное число")
class OppositeNumberTest {

    @ParameterizedTest(name = "opposite({0}) → {1}")
    @CsvSource({
            "1,      -1",
            "14,     -14",
            "999,    -999",
            "-1,      1",
            "-34,     34",
            "-999,    999",
            "0,       0",
            "2147483647,  -2147483647"     // Integer.MAX_VALUE
    })
    void shouldReturnOpposite(int input, int expected) {
        assertThat(OppositeNumber.opposite(input)).isEqualTo(expected);
    }
}