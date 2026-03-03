package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Иголка в стоге сена")
class ANeedleInTheHaystackTest {

    @ParameterizedTest(name = "findNeedle → \"{1}\"")
    @MethodSource("testCases")
    void shouldFindNeedle(Object[] haystack, String expected) {
        assertThat(ANeedleInTheHaystack.findNeedle(haystack)).isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                // Смесь типов: String, null, int, boolean
                Arguments.of(
                        new Object[]{"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false},
                        "found the needle at position 3"),

                // Только строки
                Arguments.of(
                        new Object[]{"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something"},
                        "found the needle at position 5"),

                // Много чисел, needle в конце
                Arguments.of(
                        new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 8, 7, 5, 4, 3, 4, 5, 6, 67, 5, 5, 3, 3, 4, 2, 34, 234, 23, 4, 234, 324, 324, "needle", 1},
                        "found the needle at position 30"),

                // Простой случай
                Arguments.of(
                        new Object[]{"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"},
                        "found the needle at position 5"),

                // new String("needle") — проверка equals vs ==
                Arguments.of(
                        new Object[]{"junk", "more junk", new String("needle"), "gadget"},
                        "found the needle at position 2")
        );
    }
}