package com.nikolas.codewars.kyu8;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class HexToDecimalTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void testHexToDecimal(String input, int expected) {
        assertThat(HexToDecimal.hexToDec(input)).isEqualTo(expected);
    }

    static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{"1", 1},
                new Object[]{"a", 10},
                new Object[]{"10", 16},
                new Object[]{"FF", 255},
                new Object[]{"-C", -12},
                new Object[]{"0", 0},
                new Object[]{"7F", 127},
                new Object[]{"-1A", -26}
        );
    }
}