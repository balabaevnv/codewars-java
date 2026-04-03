package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GhostCodeTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of("Javatlacati", "Hello my name is Javatlacati"),
                Arguments.of("", "Hello world!"),
                Arguments.of(null, "Hello world!"),
                Arguments.of("John", "Hello my name is John")
        );
    }

    @ParameterizedTest(name = "[{index}] name={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(String name, String expected) {
        assertEquals(expected, GhostCode.helloName(name));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of("   ", "Hello my name is    "), // пробелы не обрезаются
                Arguments.of("  ", "Hello my name is   ")
        );
    }

    @ParameterizedTest(name = "[{index}] edge name={0} -> expected={1}")
    @MethodSource("edgeCases")
    void edgeTests(String name, String expected) {
        assertEquals(expected, GhostCode.helloName(name));
    }

    @Test
    void randomTests() {
        for (int i = 0; i < 100; i++) {
            String name = randomString();
            String expected = (name == null || name.isEmpty()) ? "Hello world!" : "Hello my name is " + name;
            assertEquals(expected, GhostCode.helloName(name));
        }
    }

    private String randomString() {
        double r = Math.random();
        if (r < 0.1) return null;
        if (r < 0.2) return "";
        int len = (int) (Math.random() * 10) + 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append((char) ('a' + (int) (Math.random() * 26)));
        }
        return sb.toString();
    }
}