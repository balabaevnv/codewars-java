package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class WellOfIdeasEasyVersionTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void testWell(String[] input, String expected) {
        assertThat(WellOfIdeasEasyVersion.well(input)).isEqualTo(expected);
    }

    static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{new String[]{"bad","bad","bad"}, "Fail!"},
                new Object[]{new String[]{"good","bad","bad"}, "Publish!"},
                new Object[]{new String[]{"good","good","bad"}, "Publish!"},
                new Object[]{new String[]{"good","good","good"}, "I smell a series!"},
                new Object[]{new String[]{}, "Fail!"}
        );
    }
}