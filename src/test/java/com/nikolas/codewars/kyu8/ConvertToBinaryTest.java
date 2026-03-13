package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class ConvertToBinaryTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void testToBinary(int input, int expected) {
        assertThat(ConvertToBinary.toBinary(input)).isEqualTo(expected);
    }

    static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{0, 0},
                new Object[]{1, 1},
                new Object[]{2, 10},
                new Object[]{3, 11},
                new Object[]{5, 101},
                new Object[]{10, 1010},
                new Object[]{15, 1111}
        );
    }
}