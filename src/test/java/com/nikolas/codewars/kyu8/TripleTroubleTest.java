package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TripleTroubleTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of("this", "test", "lock", "ttlheoiscstk"),
                Arguments.of("aa", "bb", "cc", "abcabc"),
                Arguments.of("Bm", "aa", "tn", "Batman"),
                Arguments.of("LLh", "euo", "xtr", "LexLuthor")
        );
    }

    @ParameterizedTest(name = "[{index}] input=({0},{1},{2}) -> expected={3}")
    @MethodSource("validCases")
    void validTests(String one, String two, String three, String expected) {

        assertEquals(expected,
                TripleTrouble.tripleTrouble(one, two, three));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of("", "", "", ""),
                Arguments.of("A", "B", "C", "ABC")
        );
    }

    @ParameterizedTest(name = "[{index}] edge input=({0},{1},{2}) -> expected={3}")
    @MethodSource("edgeCases")
    void edgeTests(String one, String two, String three, String expected) {

        assertEquals(expected,
                TripleTrouble.tripleTrouble(one, two, three));
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of();
    }

    @Test
    void randomTests() {

        for (int i = 0; i < 100; i++) {

            String a = "A".repeat(i);
            String b = "B".repeat(i);
            String c = "C".repeat(i);

            StringBuilder expected = new StringBuilder(i * 3);

            for (int j = 0; j < i; j++) {
                expected.append('A').append('B').append('C');
            }

            assertEquals(expected.toString(),
                    TripleTrouble.tripleTrouble(a, b, c));
        }
    }
}