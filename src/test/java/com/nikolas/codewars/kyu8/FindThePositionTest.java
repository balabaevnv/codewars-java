package com.nikolas.codewars.kyu8;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class FindThePositionTest {

    @ParameterizedTest(name = "{index} => input={0}, expected={1}")
    @MethodSource("testCases")
    void testPosition(char input, String expected) {
        assertThat(FindThePosition.position(input)).isEqualTo(expected);
    }

    static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{'a', "Position of alphabet: 1"},
                new Object[]{'z', "Position of alphabet: 26"},
                new Object[]{'e', "Position of alphabet: 5"},
                new Object[]{'m', "Position of alphabet: 13"},
                new Object[]{'b', "Position of alphabet: 2"}
        );
    }
}