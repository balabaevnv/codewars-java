package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Конвертация ДНК → РНК")
class DNAToRNAConversionTest {

    @ParameterizedTest(name = "dnaToRna(\"{0}\") → \"{1}\"")
    @CsvSource({
            "GCAT,   GCAU",
            "TTTT,   UUUU",
            "GCAA,   GCAA",
            "GCTAACG, GCUAACG",
            "T,      U",
            "A,      A"
    })
    void shouldConvertDnaToRna(String input, String expected) {
        assertThat(DNAToRNAConversion.dnaToRna(input)).isEqualTo(expected);
    }

    @ParameterizedTest(name = "пустая строка → пустая строка")
    @EmptySource
    void shouldHandleEmptyString(String input) {
        assertThat(DNAToRNAConversion.dnaToRna(input)).isEmpty();
    }
}