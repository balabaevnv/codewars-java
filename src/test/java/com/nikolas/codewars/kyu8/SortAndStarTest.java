package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortAndStarTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(
                        new String[]{"bitcoin","take","over","the","world","maybe","who","knows","perhaps"},
                        "b***i***t***c***o***i***n"
                ),
                Arguments.of(
                        new String[]{"turns","out","random","test","cases","are","easier","than","writing","out","basic","ones"},
                        "a***r***e"
                )
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testTwoSort(String[] input, String expected) {
        assertEquals(expected, SortAndStar.twoSort(input));
    }
}