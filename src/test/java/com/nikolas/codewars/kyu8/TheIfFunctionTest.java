package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TheIfFunctionTest {

    @ParameterizedTest(name = "{index}: _if({0})")
    @MethodSource("testCases")
    void testIf(Boolean input, String expected) {
        AtomicReference<String> actual = new AtomicReference<>("no function");
        TheIfFunction._if(input,
                () -> actual.set("true function"),
                () -> actual.set("false function"));
        assertEquals(expected, actual.get());
    }

    static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{true, "true function"},
                new Object[]{false, "false function"},
                new Object[]{null, "false function"}
        );
    }
}