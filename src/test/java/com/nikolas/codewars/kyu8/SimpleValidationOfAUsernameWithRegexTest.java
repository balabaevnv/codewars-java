package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleValidationOfAUsernameWithRegexTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of("regex", true),
                Arguments.of("____", true),
                Arguments.of("p1pp1", true),
                Arguments.of("asd43_34", true)
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(String input, boolean expected) {

        assertEquals(expected,
                SimpleValidationOfAUsernameWithRegex.validateUsr(input));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of("abcd", true),
                Arguments.of("0123", true),
                Arguments.of("012", false),
                Arguments.of("", false)
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("edgeCases")
    void edgeTests(String input, boolean expected) {

        assertEquals(expected,
                SimpleValidationOfAUsernameWithRegex.validateUsr(input));
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of(
                Arguments.of("Hass", false),
                Arguments.of("asd43 34", false),
                Arguments.of("Hasd_12assssssasasasasasaasasasasas", false),
                Arguments.of("user!", false)
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("invalidCases")
    void invalidTests(String input, boolean expected) {

        assertEquals(expected,
                SimpleValidationOfAUsernameWithRegex.validateUsr(input));
    }

    @Test
    void randomTests() {

        String[] samples = {
                "user1", "test_123", "abcd", "1234",
                "bad space", "UPPER", "a", "toolongusernameeeee"
        };

        for (String s : samples) {

            boolean expected = s.matches("^[a-z0-9_]{4,16}$");

            boolean actual =
                    SimpleValidationOfAUsernameWithRegex.validateUsr(s);

            assertEquals(expected, actual);
        }
    }
}