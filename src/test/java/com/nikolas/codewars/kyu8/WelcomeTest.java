package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WelcomeTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("english", "Welcome"),
                Arguments.of("dutch", "Welkom"),
                Arguments.of("french", "Bienvenue"),
                Arguments.of("german", "Willkommen"),
                Arguments.of("swedish", "Valkommen"),
                Arguments.of("unknown", "Welcome"),
                Arguments.of("IP_ADDRESS_INVALID", "Welcome"),
                Arguments.of(null, "Welcome")
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testGreet(String language, String expected) {
        assertEquals(expected, Welcome.greet(language));
    }
}