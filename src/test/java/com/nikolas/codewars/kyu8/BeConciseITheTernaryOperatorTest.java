package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeConciseITheTernaryOperatorTest {

    @ParameterizedTest
    @CsvSource({
            "9, kid",
            "10, kid",
            "11, kid",
            "12, kid",
            "13, teenager",
            "14, teenager",
            "15, teenager",
            "16, teenager",
            "17, teenager",
            "18, adult",
            "19, adult",
            "63, adult",
            "64, adult",
            "65, elderly",
            "66, elderly",
            "100, elderly"
    })
    void testDescribeAge(int age, String expectedCategory) {
        String expected = "You're a(n) " + expectedCategory;
        assertEquals(expected, BeConciseITheTernaryOperator.describeAge(age));
    }
}