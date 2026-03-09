package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExclusiveXORLogicalOperatorTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(false, false, false),
                Arguments.of(false, true, true),
                Arguments.of(true, false, true),
                Arguments.of(true, true, false)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testXor(boolean a, boolean b, boolean expected) {
        assertEquals(expected,
                ExclusiveXORLogicalOperator.xor(a, b));
    }
}