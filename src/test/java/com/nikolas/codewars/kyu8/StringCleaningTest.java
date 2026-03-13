package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCleaningTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of("", ""),
                Arguments.of("! !", "! !"),
                Arguments.of("123456789", ""),
                Arguments.of("(E3at m2e2!!)", "(Eat me!!)"),
                Arguments.of("This looks5 grea8t!", "This looks great!")
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(String input, String expected) {
        assertEquals(expected, StringCleaning.stringClean(input));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of("0", ""),
                Arguments.of("a1", "a"),
                Arguments.of("1a", "a")
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("edgeCases")
    void edgeTests(String input, String expected) {
        assertEquals(expected, StringCleaning.stringClean(input));
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of();
    }


    @Test
    void randomTests() {

        for (int i = 0; i < 100; i++) {

            String random = generateRandomString();

            String expected = referenceSolution(random);
            String actual = StringCleaning.stringClean(random);

            assertEquals(expected, actual);
        }
    }

    private static String referenceSolution(String s) {
        return s.replaceAll("\\d", "");
    }

    private static String generateRandomString() {

        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*() ";
        StringBuilder sb = new StringBuilder();

        int len = ThreadLocalRandom.current().nextInt(5, 40);

        for (int i = 0; i < len; i++) {
            sb.append(chars.charAt(ThreadLocalRandom.current().nextInt(chars.length())));
        }

        return sb.toString();
    }
}