package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnexpectedParsingTest {

    @Test
    void testFixed() {
        assertEquals("busy", UnexpectedParsing.getStatus(true).get("status"));
        assertEquals("available", UnexpectedParsing.getStatus(false).get("status"));
    }

    @ParameterizedTest
    @CsvSource({
            "true, busy",
            "false, available"
    })
    void testWithParams(boolean isBusy, String expectedStatus) {
        assertEquals(expectedStatus, UnexpectedParsing.getStatus(isBusy).get("status"));
    }

    @Test
    void testReturnType() {
        // проверяем, что возвращается именно HashMap (а не Map или др.)
        HashMap<String, String> result = UnexpectedParsing.getStatus(true);
        assertEquals("busy", result.get("status"));
        // дополнительно: проверка размера
        assertEquals(1, result.size());
    }
}