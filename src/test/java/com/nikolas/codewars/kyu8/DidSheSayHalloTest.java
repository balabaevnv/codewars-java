package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DidSheSayHalloTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of("hello", true),
                Arguments.of("ciao bella!", true),
                Arguments.of("salut", true),
                Arguments.of("hallo, salut", true),
                Arguments.of("hombre! Hola!", true),
                Arguments.of("Hallo, wie geht's dir?", true),
                Arguments.of("AHOJ!", true),
                Arguments.of("czesc", true),
                Arguments.of("Ahoj", true)
        );
    }

    @ParameterizedTest(name = "[{index}] s=\"{0}\" -> expected={1}")
    @MethodSource("validCases")
    void validTests(String s, boolean expected){
        assertEquals(expected, DidSheSayHallo.validateHello(s));
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of(
                Arguments.of("meh", false),
                Arguments.of("", false),
                Arguments.of("unknown", false),
                Arguments.of(null, false)
        );
    }

    @ParameterizedTest(name = "[{index}] s=\"{0}\" -> expected={1}")
    @MethodSource("invalidCases")
    void invalidTests(String s, boolean expected){
        assertEquals(expected, DidSheSayHallo.validateHello(s));
    }

    @Test
    void randomTests() {
        String[] testCases = {"HELLO there", "cIaO!", "nope", "bonjour", "AHOJ mate"};
        for(String s : testCases){
            boolean expected = s != null &&
                    (s.toLowerCase().contains("hello") || s.toLowerCase().contains("ciao") ||
                            s.toLowerCase().contains("salut") || s.toLowerCase().contains("hallo") ||
                            s.toLowerCase().contains("hola") || s.toLowerCase().contains("ahoj") ||
                            s.toLowerCase().contains("czesc"));
            assertEquals(expected, DidSheSayHallo.validateHello(s));
        }
    }
}