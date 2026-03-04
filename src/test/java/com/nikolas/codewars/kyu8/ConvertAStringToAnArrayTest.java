package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Разбивает строку по пробелам в массив")
class ConvertAStringToAnArrayTest {

    @ParameterizedTest(name = "\"{0}\" → {1}")
    @MethodSource("testCases")
    void shouldConvertStringToArray(String input, String[] expected) {
        assertThat(ConvertAStringToAnArray.stringToArray(input))
                .containsExactly(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("Robin Singh",
                        new String[]{"Robin", "Singh"}),

                Arguments.of("I love arrays they are my favorite",
                        new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}),

                Arguments.of("Hello World",
                        new String[]{"Hello", "World"}),

                Arguments.of("One",
                        new String[]{"One"})
        );
    }
}