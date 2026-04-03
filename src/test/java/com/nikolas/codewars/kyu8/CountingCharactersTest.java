package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountingCharactersTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of("missippi", 'i', 3),
                Arguments.of("feed", 'e', 2),
                Arguments.of("aaaaaaaa", 'a', 8),
                Arguments.of("quicksilver", 'z', 0)
        );
    }

    @ParameterizedTest(name = "[{index}] s={0}, c={1} -> expected={2}")
    @MethodSource("validCases")
    void validTests(String s, char c, int expected) {
        assertEquals(expected, CountingCharacters.countCharOccurrences(s, c));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of("", 'a', 0),
                Arguments.of(null, 'a', 0),
                Arguments.of("a", 'a', 1),
                Arguments.of("b", 'a', 0)
        );
    }

    @ParameterizedTest(name = "[{index}] edge s={0}, c={1} -> expected={2}")
    @MethodSource("edgeCases")
    void edgeTests(String s, char c, int expected) {
        assertEquals(expected, CountingCharacters.countCharOccurrences(s, c));
    }

    @Test
    void randomTests() {
        for (int i = 0; i < 100; i++) {
            String s = randomString();
            char c = (char) ('a' + (int) (Math.random() * 26));
            int expected = referenceCount(s, c);
            assertEquals(expected, CountingCharacters.countCharOccurrences(s, c));
        }
    }

    private String randomString() {
        int len = (int) (Math.random() * 20);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append((char) ('a' + (int) (Math.random() * 26)));
        }
        return sb.toString();
    }

    private int referenceCount(String s, char c) {
        if (s == null) return 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) count++;
        }
        return count;
    }
}