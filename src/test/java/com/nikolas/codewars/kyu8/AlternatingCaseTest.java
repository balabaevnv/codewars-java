package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlternatingCaseTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("hello world", "HELLO WORLD"),
                Arguments.of("HELLO WORLD", "hello world"),
                Arguments.of("hello WORLD", "HELLO world"),
                Arguments.of("HeLLo WoRLD", "hEllO wOrld"),
                Arguments.of("12345", "12345"),
                Arguments.of("1a2b3c4d5e", "1A2B3C4D5E"),
                Arguments.of("StringUtils.toAlternatingCase", "sTRINGuTILS.TOaLTERNATINGcASE"),
                Arguments.of("Hello World", "hELLO wORLD")
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testAlternatingCase(String input, String expected) {
        assertEquals(expected, AlternatingCase.toAlternativeString(input));
    }
}