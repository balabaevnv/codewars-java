package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EasyLogsTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(10, 2, 3, 0.7781512503836435),
                Arguments.of(5, 2, 3, 1.1132827525593785),
                Arguments.of(1000, 2, 3, 0.25938375012788123),
                Arguments.of(2, 4, 8, 5.0)  // log2(4)=2, log2(8)=3, sum=5
        );
    }

    @ParameterizedTest(name = "log_{0}({1}) + log_{0}({2}) = {3}")
    @MethodSource("validCases")
    void validTests(double x, double a, double b, double expected) {
        assertEquals(expected, EasyLogs.logs(x, a, b), 1e-9);
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(2, 1, 1, 0.0),
                Arguments.of(3, 9, 27, 5.0) // log3(9)=2, log3(27)=3
        );
    }

    @ParameterizedTest
    @MethodSource("edgeCases")
    void edgeTests(double x, double a, double b, double expected) {
        assertEquals(expected, EasyLogs.logs(x, a, b), 1e-9);
    }

    @Test
    void randomTests() {
        for (int i = 0; i < 100; i++) {
            double x = 1 + Math.random() * 10;
            double a = 1 + Math.random() * 100;
            double b = 1 + Math.random() * 100;
            double expected = Math.log(a) / Math.log(x) + Math.log(b) / Math.log(x);
            assertEquals(expected, EasyLogs.logs(x, a, b), 1e-9);
        }
    }
}