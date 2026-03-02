package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("boolean → Yes/No")
class ConvertBooleanValuesToStringsYesOrNoTest {

        @ParameterizedTest(name = "boolToWord({0}) → \"{1}\"")
        @CsvSource({
                "true,  Yes",
                "false, No"
        })
        void shouldConvert(boolean input, String expected) {
            assertThat(ConvertBooleanValuesToStringsYesOrNo.boolToWord(input))
                    .isEqualTo(expected);
        }
}