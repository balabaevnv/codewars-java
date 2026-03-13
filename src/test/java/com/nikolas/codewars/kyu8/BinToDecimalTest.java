package com.nikolas.codewars.kyu8;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class BinToDecimalTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void testBinToDecimal(String input, int expected) {
        assertThat(BinToDecimal.binToDecimal(input)).isEqualTo(expected);
    }

    static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{"1", 1},
                new Object[]{"0", 0},
                new Object[]{"1001001", 73},
                new Object[]{"0001", 1},
                new Object[]{"11111111", 255}
        );
    }
}