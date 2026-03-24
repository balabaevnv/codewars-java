package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class IsItANumberTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of("3", true),
                Arguments.of("  3  ", true),
                Arguments.of("-3.23", true),
                Arguments.of("+4.56", true),
                Arguments.of("0", true),
                Arguments.of("0.0", true)
        );
    }

    @ParameterizedTest(name = "[{index}] s=\"{0}\" -> expected={1}")
    @MethodSource("validCases")
    void validTests(String s, boolean expected){
        assertEquals(expected, IsItANumber.isDigit(s));
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of(
                Arguments.of("3-4", false),
                Arguments.of("3 5", false),
                Arguments.of("zero", false),
                Arguments.of("", false),
                Arguments.of("   ", false),
                Arguments.of(null, false)
        );
    }

    @ParameterizedTest(name = "[{index}] s=\"{0}\" -> expected={1}")
    @MethodSource("invalidCases")
    void invalidTests(String s, boolean expected){
        assertEquals(expected, IsItANumber.isDigit(s));
    }

    @Test
    void randomTests() {
        String[] testCases = {"7", "-0.1", "123.456", "5e3", "NaN", "Infinity", "abc", "1 2"};
        for(String s : testCases){
            boolean expected;
            try {
                Double.parseDouble(s.trim());
                expected = true;
            } catch(Exception e) {
                expected = false;
            }
            assertEquals(expected, IsItANumber.isDigit(s));
        }
    }
}