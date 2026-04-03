package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NeutralisationTest {

    // ---- Валидные случаи (из условия) ----
    @Test
    void fixedTests() {
        assertEquals("", Neutralisation.neutralise("", ""));
        assertEquals("+", Neutralisation.neutralise("+", "+"));
        assertEquals("-", Neutralisation.neutralise("-", "-"));
        assertEquals("0", Neutralisation.neutralise("+", "-"));
        assertEquals("0", Neutralisation.neutralise("-", "+"));
        assertEquals("000000", Neutralisation.neutralise("--++--", "++--++"));
        assertEquals("-+-+-+", Neutralisation.neutralise("-+-+-+", "-+-+-+"));
        assertEquals("-+00", Neutralisation.neutralise("-++-", "-+-+"));
        assertEquals("00++", Neutralisation.neutralise("--++", "++++"));
        assertEquals("++0--000-", Neutralisation.neutralise("+++--+---", "++----++-"));
        assertEquals("-----", Neutralisation.neutralise("-----", "-----"));
        assertEquals("0+", Neutralisation.neutralise("-+", "++"));
        assertEquals("-0", Neutralisation.neutralise("--", "-+"));
        assertEquals("000", Neutralisation.neutralise("-++", "+--"));
        assertEquals("0+0+0000+0", Neutralisation.neutralise("++-++--++-", "-+++-++-++"));
        assertEquals("00+0+000-", Neutralisation.neutralise("-++-+-++-", "+-++++---"));
        assertEquals("-00+0-+0-", Neutralisation.neutralise("---++-+--", "-+++--++-"));
        assertEquals("0-0-0-++0-", Neutralisation.neutralise("+-----+++-", "--+-+-++--"));
        assertEquals("0--00-+0", Neutralisation.neutralise("+-----+-", "---++-++"));
        assertEquals("-+--+-+-0-", Neutralisation.neutralise("-+--+-+---", "-+--+-+-+-"));
        assertEquals("00+", Neutralisation.neutralise("+-+", "-++"));
        assertEquals("-+0", Neutralisation.neutralise("-++", "-+-"));
        assertEquals("-00+", Neutralisation.neutralise("---+", "-+++"));
        assertEquals("+--", Neutralisation.neutralise("+--", "+--"));
        assertEquals("00+++-0-", Neutralisation.neutralise("--+++-+-", "+++++---"));
    }

    // ---- Дополнительные граничные случаи ----
    static Stream<org.junit.jupiter.params.provider.Arguments> edgeCases() {
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of("", "", ""),
                org.junit.jupiter.params.provider.Arguments.of("+", "+", "+"),
                org.junit.jupiter.params.provider.Arguments.of("-", "-", "-"),
                org.junit.jupiter.params.provider.Arguments.of("++", "--", "00"),
                org.junit.jupiter.params.provider.Arguments.of("+-", "-+", "00"),
                org.junit.jupiter.params.provider.Arguments.of("+++", "---", "000"),
                org.junit.jupiter.params.provider.Arguments.of("+++", "+++", "+++"),
                org.junit.jupiter.params.provider.Arguments.of("---", "---", "---")
        );
    }

    @ParameterizedTest
    @MethodSource("edgeCases")
    void edgeTests(String s1, String s2, String expected) {
        assertEquals(expected, Neutralisation.neutralise(s1, s2));
    }

    // ---- Случайные тесты ----
    @Test
    void randomTests() {
        for (int t = 0; t < 100; t++) {
            int len = (int) (Math.random() * 50);
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < len; i++) {
                sb1.append(Math.random() < 0.5 ? '+' : '-');
                sb2.append(Math.random() < 0.5 ? '+' : '-');
            }
            String s1 = sb1.toString();
            String s2 = sb2.toString();
            String expected = referenceNeutralise(s1, s2);
            assertEquals(expected, Neutralisation.neutralise(s1, s2));
        }
    }

    // Эталонная реализация (StringBuilder)
    private String referenceNeutralise(String s1, String s2) {
        StringBuilder sb = new StringBuilder(s1.length());
        for (int i = 0; i < s1.length(); i++) {
            sb.append(s1.charAt(i) == s2.charAt(i) ? s1.charAt(i) : '0');
        }
        return sb.toString();
    }
}