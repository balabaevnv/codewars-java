package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class IsYourPeriodLateTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(LocalDate.of(2016, 6, 13), LocalDate.of(2016, 7, 16), 35, false),
                Arguments.of(LocalDate.of(2016, 6, 13), LocalDate.of(2016, 7, 16), 28, true),
                Arguments.of(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 2), 1, false),
                Arguments.of(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 2), 0, true),
                Arguments.of(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 1), 0, false),
                Arguments.of(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 1), -1, true)
        );
    }

    @ParameterizedTest
    @MethodSource("validCases")
    void testPeriodIsLate(LocalDate last, LocalDate today, int cycleLength, boolean expected) {
        assertEquals(expected, IsYourPeriodLate.periodIsLate(last, today, cycleLength));
    }

    @Test
    void randomTests() {
        for (int i = 0; i < 1000; i++) {
            LocalDate last = randomDate();
            LocalDate today = last.plusDays((long) (Math.random() * 365 * 10)); // до 10 лет
            int cycleLength = (int) (Math.random() * 365 * 2);
            boolean expected = today.toEpochDay() - last.toEpochDay() > cycleLength;
            assertEquals(expected, IsYourPeriodLate.periodIsLate(last, today, cycleLength));
        }
    }

    private LocalDate randomDate() {
        long epochDay = (long) (Math.random() * 365 * 100) + 10000; // с 1997 по ~2097
        return LocalDate.ofEpochDay(epochDay);
    }
}