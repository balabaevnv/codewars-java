package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FuelCalculatorTotalCostTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(5, 1.23, 5.65),
                Arguments.of(8, 2.50, 18.40),
                Arguments.of(5, 5.60, 27.50),
                Arguments.of(0, 1.23, 0.00),
                Arguments.of(2, 1.00, 1.90),
                Arguments.of(4, 1.00, 3.60),
                Arguments.of(10, 1.00, 7.50)
        );
    }

    @ParameterizedTest(name = "litres={0}, price={1} -> total={2}")
    @MethodSource("validCases")
    void validTests(int litres, double price, double expected) {
        assertEquals(expected, FuelCalculatorTotalCost.fuelPrice(litres, price), 0.001);
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(12, 1.00, 9.00),
                Arguments.of(1, 1.00, 1.00),
                Arguments.of(0, 2.50, 0.00)
        );
    }

    @ParameterizedTest
    @MethodSource("edgeCases")
    void edgeTests(int litres, double price, double expected) {
        assertEquals(expected, FuelCalculatorTotalCost.fuelPrice(litres, price), 0.001);
    }

    @Test
    void randomTests() {
        for (int i = 0; i < 100; i++) {
            int litres = (int) (Math.random() * 50);
            double price = Math.random() * 10;
            double expected = referenceFuelPrice(litres, price);
            assertEquals(expected, FuelCalculatorTotalCost.fuelPrice(litres, price), 0.001);
        }
    }

    private double referenceFuelPrice(int litres, double pricePerLitre) {
        int discountCents = Math.min(litres / 2 * 5, 25);
        int priceCents = (int) Math.round(pricePerLitre * 100);
        int totalCents = litres * (priceCents - discountCents);
        return totalCents / 100.0;
    }
}