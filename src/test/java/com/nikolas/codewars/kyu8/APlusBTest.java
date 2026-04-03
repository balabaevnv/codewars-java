package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class APlusBTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of((byte) 1, (byte) 2, (byte) 3),
                Arguments.of((byte) 0, (byte) 0, (byte) 0),
                Arguments.of((byte) -5, (byte) 3, (byte) -2),
                Arguments.of((byte) 100, (byte) 27, (byte) 127),
                Arguments.of((byte) -128, (byte) 127, (byte) -1)
        );
    }

    @ParameterizedTest(name = "[{index}] {0} + {1} = {2}")
    @MethodSource("validCases")
    void validTests(byte a, byte b, byte expected) {
        assertEquals(expected, APlusB.sum(a, b));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of((byte) -128, (byte) -128, (byte) 0)   // -128 + -128 = -256, обрезается до 0? Нет, в byte не влезает, но по условию не должно быть.
        );
    }

    @ParameterizedTest(name = "[{index}] edge {0} + {1} = {2}")
    @MethodSource("edgeCases")
    void edgeTests(byte a, byte b, byte expected) {
        // В реальных условиях такие входные данные не допускаются условием, но для полноты
        assertEquals(expected, APlusB.sum(a, b));
    }

    @Test
    void randomTests() {
        for (int i = 0; i < 100; i++) {
            byte a = (byte) (Math.random() * 256 - 128);
            byte b = (byte) (Math.random() * 256 - 128);
            byte expected = (byte) (a + b);
            assertEquals(expected, APlusB.sum(a, b));
        }
    }
}