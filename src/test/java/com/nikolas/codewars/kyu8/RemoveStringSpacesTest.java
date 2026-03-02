package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Удаление пробелов из строки")
class RemoveStringSpacesTest {

    @ParameterizedTest(name = "noSpace(\"{0}\") → \"{1}\"")
    @CsvSource({
            "'8 j 8   mBliB8g  imjB8B8  jl  B',     '8j8mBliB8gimjB8B8jlB'",
            "'8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd', '88Bifk8hB8BB8BBBB888chl8BhBfd'",
            "'8aaaaa dddd r     ',                     '8aaaaaddddr'",
            "'jfBm  gk lf8hg  88lbe8 ',                'jfBmgklf8hg88lbe8'",
            "'8j aam',                                  '8jaam'"
    })
    void shouldRemoveSpaces(String input, String expected) {
        assertThat(RemoveStringSpaces.noSpace(input)).isEqualTo(expected);
    }
}