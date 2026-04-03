package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HowDoICompareTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(0, "nothing"),
                Arguments.of(123, "nothing"),
                Arguments.of(-1, "nothing"),
                Arguments.of(42, "everything"),
                Arguments.of(42 * 42, "everything squared")
        );
    }

    @ParameterizedTest(name = "[{index}] x={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(Integer x, String expected) {
        assertEquals(expected, HowDoICompare.whatIs(x));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(null, "nothing"),      // метод должен вернуть "nothing" для null
                Arguments.of(1764, "everything squared"), // дублируем для проверки, что 1764 также работает
                Arguments.of(1000, "nothing")
        );
    }

    @ParameterizedTest(name = "[{index}] x={0} -> expected={1}")
    @MethodSource("edgeCases")
    void edgeTests(Integer x, String expected) {
        assertEquals(expected, HowDoICompare.whatIs(x));
    }

    static Stream<Arguments> invalidCases() {
        return Stream.empty(); // нет невалидных входов, кроме null, уже обработан
    }

    @Test
    void randomTests() {
        for (int i = 0; i < 100; i++) {
            int value = (int) (Math.random() * 2000) - 1000; // от -1000 до 999
            Integer x = value;
            String expected;
            if (value == 42) expected = "everything";
            else if (value == 42 * 42) expected = "everything squared";
            else expected = "nothing";
            assertEquals(expected, HowDoICompare.whatIs(x));
        }
    }
}