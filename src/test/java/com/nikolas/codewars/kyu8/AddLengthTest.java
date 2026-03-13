package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;

class AddLengthTest {

    @ParameterizedTest(name = "addLength(\"{0}\") → {1}")
    @MethodSource("testCases")
    void testAddLength(String input, String[] expected) {
        assertThat(AddLength.addLength(input)).isEqualTo(expected);
    }

    static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{"apple ban", new String[]{"apple 5","ban 3"}},
                new Object[]{"you will win", new String[]{"you 3","will 4","win 3"}},
                new Object[]{"you", new String[]{"you 3"}},
                new Object[]{"y", new String[]{"y 1"}}
        );
    }
}