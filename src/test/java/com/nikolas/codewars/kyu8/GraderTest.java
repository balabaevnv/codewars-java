package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GraderTest {

    // ---- Валидные случаи (граничные и типичные) ----
    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(0.6,  'D'),
                Arguments.of(0.7,  'C'),
                Arguments.of(0.8,  'B'),
                Arguments.of(0.9,  'A'),
                Arguments.of(1.0,  'A'),
                Arguments.of(0.65, 'D'),
                Arguments.of(0.75, 'C'),
                Arguments.of(0.85, 'B'),
                Arguments.of(0.95, 'A')
        );
    }

    @ParameterizedTest(name = "score={0} -> {1}")
    @MethodSource("validCases")
    void validTests(double score, char expected) {
        assertEquals(expected, Grader.grader(score));
    }

    // ---- Граничные случаи (вне диапазона) ----
    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(1.01, 'F'),
                Arguments.of(1.1,  'F'),
                Arguments.of(0.59, 'F'),
                Arguments.of(0.0,  'F'),
                Arguments.of(-0.5, 'F')
        );
    }

    @ParameterizedTest(name = "score={0} -> {1}")
    @MethodSource("edgeCases")
    void edgeTests(double score, char expected) {
        assertEquals(expected, Grader.grader(score));
    }

    // ---- Тесты из условия (CsvSource) ----
    @ParameterizedTest(name = "score = {1}")
    @CsvSource(textBlock = """
        A, 1.00
        F, 1.01
        C, 0.70
        B, 0.85
        B, 0.80
        A, 0.90
        F, 0.50
        D, 0.60
        A, 0.95
        D, 0.69
        F, 0.20
        F, 0.00
    """)
    void fixedTests(char answer, double score) {
        assertEquals(answer, Grader.grader(score));
    }

    // ---- Случайные тесты ----
    @Test
    void randomTests() {
        for (int i = 0; i < 100; i++) {
            double score = Math.random() * 2.0; // от 0 до 2
            char expected = referenceGrader(score);
            assertEquals(expected, Grader.grader(score));
        }
    }

    // Эталонная реализация (по условию)
    private char referenceGrader(double score) {
        if (score > 1.0 || score < 0.6) return 'F';
        if (score >= 0.9) return 'A';
        if (score >= 0.8) return 'B';
        if (score >= 0.7) return 'C';
        return 'D';
    }
}