package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationTableForNumberTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(
                        5,
                        "1 * 5 = 5\n" +
                                "2 * 5 = 10\n" +
                                "3 * 5 = 15\n" +
                                "4 * 5 = 20\n" +
                                "5 * 5 = 25\n" +
                                "6 * 5 = 30\n" +
                                "7 * 5 = 35\n" +
                                "8 * 5 = 40\n" +
                                "9 * 5 = 45\n" +
                                "10 * 5 = 50"
                ),
                Arguments.of(
                        1,
                        "1 * 1 = 1\n" +
                                "2 * 1 = 2\n" +
                                "3 * 1 = 3\n" +
                                "4 * 1 = 4\n" +
                                "5 * 1 = 5\n" +
                                "6 * 1 = 6\n" +
                                "7 * 1 = 7\n" +
                                "8 * 1 = 8\n" +
                                "9 * 1 = 9\n" +
                                "10 * 1 = 10"
                )
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testMultiTable(int input, String expected) {
        assertEquals(expected,
                MultiplicationTableForNumber.multiTable(input));
    }
}