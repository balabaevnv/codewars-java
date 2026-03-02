package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Базовые арифметические операции")
class BasicMathematicalOperationsTest {

    @ParameterizedTest(name = "basicMath(\"{0}\", {1}, {2}) → {3}")
    @CsvSource({
            "+, 4,  7,  11",
            "+, 0,  0,  0",
            "+, -3, 5,  2",
            "-, 15, 18, -3",
            "-, 0,  0,  0",
            "-, 10, 3,  7",
            "*, 5,  5,  25",
            "*, 0,  99, 0",
            "*, -2, 3,  -6",
            "/, 49, 7,  7",
            "/, 10, 2,  5",
            "/, 0,  5,  0"
    })
    void shouldPerformOperation(String op, int v1, int v2, int expected) {
        assertThat(BasicMathematicalOperations.basicMath(op, v1, v2)).isEqualTo(expected);
    }
}