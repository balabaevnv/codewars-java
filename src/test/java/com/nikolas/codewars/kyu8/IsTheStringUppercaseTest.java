package com.nikolas.codewars.kyu8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class IsTheStringUppercaseTest {

    @ParameterizedTest
    @MethodSource("data")
    void testIsUpperCase(String input, boolean expected) {
        assertEquals(expected, IsTheStringUppercase.isUpperCase(input));
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("c", false),
                Arguments.of("C", true),
                Arguments.of("hello I AM DONALD", false),
                Arguments.of("HELLO I AM DONALD", true),
                Arguments.of("ACSKLDFJSgSKLDFJSKLDFJ", false),
                Arguments.of("ACSKLDFJSGSKLDFJSKLDFJ", true),
                Arguments.of("12345", true),
                Arguments.of("!!!", true),
                Arguments.of("", true)
        );
    }
}