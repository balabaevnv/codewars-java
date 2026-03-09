package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExpressionsMatterTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(2,1,2,6),
                Arguments.of(1,1,1,3),
                Arguments.of(2,1,1,4),
                Arguments.of(1,2,3,9),
                Arguments.of(1,3,1,5),
                Arguments.of(2,2,2,8),

                Arguments.of(5,1,3,20),
                Arguments.of(3,5,7,105),
                Arguments.of(5,6,1,35),
                Arguments.of(1,6,1,8),
                Arguments.of(2,6,1,14),
                Arguments.of(6,7,1,48),

                Arguments.of(2,10,3,60),
                Arguments.of(1,8,3,27),
                Arguments.of(9,7,2,126),
                Arguments.of(1,1,10,20),
                Arguments.of(9,1,1,18),
                Arguments.of(10,5,6,300),
                Arguments.of(1,10,1,12)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testExpressions(int a, int b, int c, int expected) {
        assertEquals(expected,
                ExpressionsMatter.expressionsMatter(a, b, c));
    }
}