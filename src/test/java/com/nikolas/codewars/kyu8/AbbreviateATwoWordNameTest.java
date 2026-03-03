package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Инициалы из двух слов")
class AbbreviateATwoWordNameTest {

    @ParameterizedTest(name = "abbrevName(\"{0}\") → \"{1}\"")
    @CsvSource({
            "Sam Harris,      S.H",
            "Patrick Feenan,  P.F",
            "Evan Cole,       E.C",
            "P Favuzzi,       P.F",
            "David Mendieta,  D.M",
            "patrick feeney,  P.F",
            "a b,             A.B"
    })
    void shouldAbbreviate(String name, String expected) {
        assertThat(AbbreviateATwoWordName.abbrevName(name)).isEqualTo(expected);
    }
}