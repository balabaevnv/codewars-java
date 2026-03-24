package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for HolidayVISharkPontoon
 */
class HolidayVISharkPontoonTest {

    // ✅ Валидные случаи
    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(12, 50, 4, 8, true, "Alive!"),
                Arguments.of(7, 55, 4, 16, true, "Alive!")
        );
    }

    @ParameterizedTest(name = "[{index}] input -> expected={5}")
    @MethodSource("validCases")
    void validTests(int pontoonDistance, int sharkDistance,
                    int youSpeed, int sharkSpeed, boolean dolphin,
                    String expected) {

        assertEquals(expected,
                HolidayVISharkPontoon.shark(
                        pontoonDistance, sharkDistance,
                        youSpeed, sharkSpeed, dolphin));
    }

    // ⚠️ Edge cases
    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(1, 1, 1, 1, false, "Shark Bait!"),
                Arguments.of(10, 10, 5, 5, true, "Alive!"),
                Arguments.of(100, 1, 10, 1, false, "Shark Bait!")
        );
    }

    @ParameterizedTest(name = "[{index}] edge -> expected={5}")
    @MethodSource("edgeCases")
    void edgeTests(int pontoonDistance, int sharkDistance,
                   int youSpeed, int sharkSpeed, boolean dolphin,
                   String expected) {

        assertEquals(expected,
                HolidayVISharkPontoon.shark(
                        pontoonDistance, sharkDistance,
                        youSpeed, sharkSpeed, dolphin));
    }

    // ❌ Невалидные (проверка логики)
    static Stream<Arguments> invalidCases() {
        return Stream.of(
                Arguments.of(24, 0, 4, 8, true, "Shark Bait!")
        );
    }

    @ParameterizedTest(name = "[{index}] invalid -> expected={5}")
    @MethodSource("invalidCases")
    void invalidTests(int pontoonDistance, int sharkDistance,
                      int youSpeed, int sharkSpeed, boolean dolphin,
                      String expected) {

        assertEquals(expected,
                HolidayVISharkPontoon.shark(
                        pontoonDistance, sharkDistance,
                        youSpeed, sharkSpeed, dolphin));
    }

    // 🎲 Random тесты
    @Test
    void randomTests() {

        for (int i = 0; i < 100; i++) {

            int pontoon = 1 + (int)(Math.random() * 100);
            int sharkDist = (int)(Math.random() * 100);
            int youSpeed = 1 + (int)(Math.random() * 10);
            int sharkSpeed = 1 + (int)(Math.random() * 10);
            boolean dolphin = Math.random() < 0.5;

            double sharkSpeedEff = dolphin ? sharkSpeed / 2.0 : sharkSpeed;

            double tYou = pontoon / (double) youSpeed;
            double tShark = sharkDist / sharkSpeedEff;

            String expected = tYou < tShark ? "Alive!" : "Shark Bait!";

            String actual = HolidayVISharkPontoon.shark(
                    pontoon, sharkDist, youSpeed, sharkSpeed, dolphin
            );

            assertEquals(expected, actual);
        }
    }
}