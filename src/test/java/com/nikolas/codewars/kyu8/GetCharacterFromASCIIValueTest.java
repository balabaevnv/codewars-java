package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GetCharacterFromASCIIValueTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(55, '7'),
                Arguments.of(56, '8'),
                Arguments.of(57, '9'),
                Arguments.of(58, ':'),
                Arguments.of(59, ';'),
                Arguments.of(60, '<'),
                Arguments.of(61, '='),
                Arguments.of(62, '>'),
                Arguments.of(63, '?'),
                Arguments.of(64, '@'),
                Arguments.of(65, 'A'),
                Arguments.of(33, '!')
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testGetChar(int ascii, char expected) {
        assertEquals(expected,
                GetCharacterFromASCIIValue.getChar(ascii));
    }
}