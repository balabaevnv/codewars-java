package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ThisIsAProblemTest {

    // ---- Валидные случаи (пример из условия) ----
    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of("John", "Doe", "John", "Doe", "John Doe"),
                Arguments.of("Jane", "Smith", "Jane", "Smith", "Jane Smith"),
                Arguments.of("", "", "", "", " ")
        );
    }

    @ParameterizedTest(name = "first={0}, last={1} -> fullName={4}")
    @MethodSource("validCases")
    void validTests(String first, String last, String expectedFirst, String expectedLast, String expectedFull) {
        ThisIsAProblem obj = new ThisIsAProblem(first, last);
        assertEquals(expectedFirst, obj.getFirstName());
        assertEquals(expectedLast, obj.getLastName());
        assertEquals(expectedFull, obj.getFullName());
    }

    // ---- Случайные тесты (сравнение с эталоном) ----
    @Test
    void randomTests() {
        for (int i = 0; i < 100; i++) {
            String first = randomString();
            String last = randomString();
            ThisIsAProblem obj = new ThisIsAProblem(first, last);
            assertEquals(first, obj.getFirstName());
            assertEquals(last, obj.getLastName());
            assertEquals(first + " " + last, obj.getFullName());
        }
    }

    private String randomString() {
        int len = (int) (Math.random() * 10) + 1;
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < len; j++) {
            sb.append((char) ('a' + (int) (Math.random() * 26)));
        }
        return sb.toString();
    }
}