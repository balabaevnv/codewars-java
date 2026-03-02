package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Приветственное сообщение")
class ReturningStringsTest {

    @ParameterizedTest(name = "greet(\"{0}\") → \"{1}\"")
    @CsvSource({
            "Ryan,   'Hello, Ryan how are you doing today?'",
            "Sara,   'Hello, Sara how are you doing today?'",
            "Alice,  'Hello, Alice how are you doing today?'",
            "A,      'Hello, A how are you doing today?'",
            "World,  'Hello, World how are you doing today?'"
    })
    void shouldGreet(String name, String expected) {
        assertThat(ReturningStrings.greet(name)).isEqualTo(expected);
    }
}