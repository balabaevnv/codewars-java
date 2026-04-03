package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheForceOfGravityBetweenTwoObjectsTest {

    private static final double EPS = 1e-5;

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(new double[]{1000, 1000, 100}, new String[]{"g", "kg", "m"}, 6.67e-12),
                Arguments.of(new double[]{1000, 1000, 100}, new String[]{"kg", "kg", "m"}, 6.67e-9),
                Arguments.of(new double[]{1000, 1000, 100}, new String[]{"kg", "kg", "cm"}, 0.0000667)
        );
    }

    @ParameterizedTest(name = "[{index}] arrVal={0}, arrUnit={1} -> expected={2}")
    @MethodSource("validCases")
    void validTests(double[] arrVal, String[] arrUnit, double expected) {
        double actual = FindTheForceOfGravityBetweenTwoObjects.solution(arrVal, arrUnit);
        assertEquals(expected, actual, expected * EPS);
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                // Все единицы по умолчанию
                Arguments.of(new double[]{1, 1, 1}, new String[]{"kg", "kg", "m"}, 6.67e-11),
                // Перевод массы из lb
                Arguments.of(new double[]{1, 1, 1}, new String[]{"lb", "kg", "m"}, 6.67e-11 * 0.453592),
                // Перевод расстояния из ft
                Arguments.of(new double[]{1, 1, 1}, new String[]{"kg", "kg", "ft"}, 6.67e-11 / (0.3048 * 0.3048)),
                // Микрограммы и микрометры
                Arguments.of(new double[]{1e9, 1e9, 1e6}, new String[]{"μg", "μg", "μm"}, 6.67e-11)
        );
    }

    @ParameterizedTest(name = "[{index}] edge arrVal={0}, arrUnit={1} -> expected={2}")
    @MethodSource("edgeCases")
    void edgeTests(double[] arrVal, String[] arrUnit, double expected) {
        double actual = FindTheForceOfGravityBetweenTwoObjects.solution(arrVal, arrUnit);
        assertEquals(expected, actual, expected * EPS);
    }

    @Test
    void randomTests() {
        for (int i = 0; i < 100; i++) {
            double m1 = Math.random() * 10000;
            double m2 = Math.random() * 10000;
            double r = Math.random() * 1000;
            String[] units = {"kg", "kg", "m"};
            double expected = 6.67e-11 * m1 * m2 / (r * r);
            assertEquals(expected, FindTheForceOfGravityBetweenTwoObjects.solution(new double[]{m1, m2, r}, units), expected * 1e-5);
        }
    }
}