package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Удаление первого и последнего символа")
class RemoveFirstAndLastCharacterTest {

    @ParameterizedTest(name = "remove(\"{0}\") → \"{1}\"")
    @CsvSource({
            "eloquent, loquen",
            "country,  ountr",
            "person,   erso",
            "place,    lac",
            "xyz,      y",
            "abcde,    bcd",
            "123456,   2345"
    })
    void shouldRemoveFirstAndLast(String input, String expected) {
        assertThat(RemoveFirstAndLastCharacter.remove(input)).isEqualTo(expected);
    }
}