package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("GetNthEvenNumber Tests")
class GetNthEvenNumberTest {

    @ParameterizedTest(name = "nthEven({0}) → {1}")
    @MethodSource("testCases")
    void shouldReturnNthEvenNumber(int input, int expected) {
        assertThat(GetNthEvenNumber.nthEven(input)).isEqualTo(expected);
    }

    static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{1, 0},
                new Object[]{2, 2},
                new Object[]{3, 4},
                new Object[]{100, 198},
                new Object[]{1298734, 2597466}
        );
    }
}