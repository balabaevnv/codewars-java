package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NameOnBillboardTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of("Jeong-Ho Aristotelis", 30, 600),
                Arguments.of("Abishai Charalampos", 30, 570),
                Arguments.of("Idwal Augustin", 30, 420),
                Arguments.of("Hadufuns John", 20, 260),
                Arguments.of("Zoroaster Donnchadh", 30, 570),
                Arguments.of("Claude Miljenko", 30, 450),
                Arguments.of("Werner Vígi", 15, 165),
                Arguments.of("Anani Fridumar", 30, 420),
                Arguments.of("Paolo Oli", 30, 270),
                Arguments.of("Hjalmar Liupold", 40, 600),
                Arguments.of("Simon Eadwulf", 30, 390)
        );
    }

    @ParameterizedTest(name = "[{index}] name={0}, price={1} -> expected={2}")
    @MethodSource("validCases")
    void validTests(String name, int price, int expected) {

        assertEquals(expected,
                NameOnBillboard.billboard(name, price));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of("", 30, 0),           // пустая строка
                Arguments.of("A", 30, 30),         // один символ
                Arguments.of(" ", 30, 30),         // пробел считается
                Arguments.of("Test", 0, 0)         // цена 0
        );
    }

    @ParameterizedTest(name = "[{index}] edge name={0}, price={1} -> expected={2}")
    @MethodSource("edgeCases")
    void edgeTests(String name, int price, int expected) {

        assertEquals(expected,
                NameOnBillboard.billboard(name, price));
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of();
    }

    @Test
    void randomTests() {

        for (int i = 0; i < 100; i++) {

            String name = "A".repeat(i);
            int price = i % 50;

            int expected = name.length() * price;

            int actual = NameOnBillboard.billboard(name, price);

            assertEquals(expected, actual);
        }
    }
}