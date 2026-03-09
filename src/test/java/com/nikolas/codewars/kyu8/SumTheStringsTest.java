package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumTheStringsTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("4", "5", "9"),
                Arguments.of("34", "5", "39"),
                Arguments.of("", "8", "8"),
                Arguments.of("9", "", "9"),
                Arguments.of("", "", "0"),
                Arguments.of("-5", "3", "-2"),
                Arguments.of("2", "", "2")
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testSum(String a, String b, String expected) {
        assertEquals(expected, SumTheStrings.sumStr(a, b));
    }
}