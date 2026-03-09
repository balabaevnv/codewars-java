package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicVariableAssignmentTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("codewa.rs")
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testName(String expected) {
        assertEquals(expected, BasicVariableAssignment.name);
    }
}