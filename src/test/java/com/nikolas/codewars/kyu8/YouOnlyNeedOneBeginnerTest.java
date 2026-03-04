package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Проверить, содержит ли массив объект x")
class YouOnlyNeedOneBeginnerTest {

    @ParameterizedTest(name = "check({0}, {1}) → {2}")
    @MethodSource("testCases")
    void shouldCheckIfArrayContainsValue(Object[] array, Object value, boolean expected) {
        assertThat(YouOnlyNeedOneBeginner.check(array, value))
                .isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new Object[]{66, 101}, 66, true),
                Arguments.of(new Object[]{80, 117, 115, 104, 45, 85, 112, 115}, 45, true),
                Arguments.of(new Object[]{'t', 'e', 's', 't'}, 'e', true),
                Arguments.of(new Object[]{"what", "a", "great", "kata"}, "kat", false),
                Arguments.of(new Object[]{null, "test"}, null, true),
                Arguments.of(new Object[]{"a", "b", "c"}, null, false)
        );
    }
}