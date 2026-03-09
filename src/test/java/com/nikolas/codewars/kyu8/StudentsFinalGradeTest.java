package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentsFinalGradeTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(99, 1, 100),
                Arguments.of(100, 12, 100),
                Arguments.of(10, 15, 100),

                Arguments.of(76, 5, 90),

                Arguments.of(55, 3, 75),

                Arguments.of(55, 0, 0),
                Arguments.of(20, 2, 0),
                Arguments.of(52, 1, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testFinalGrade(int exam, int projects, int expected) {
        assertEquals(expected,
                StudentsFinalGrade.finalGrade(exam, projects));
    }
}