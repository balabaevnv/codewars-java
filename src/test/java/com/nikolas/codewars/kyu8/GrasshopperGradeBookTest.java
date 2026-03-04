package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Возвращает буквенную оценку по среднему баллу трёх оценок")
class GrasshopperGradeBookTest {

    @ParameterizedTest(name = "getGrade({0}, {1}, {2}) → {3}")
    @MethodSource("testCases")
    void shouldReturnCorrectGrade(int s1, int s2, int s3, char expected) {
        assertThat(GrasshopperGradeBook.getGrade(s1, s2, s3))
                .isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                // A
                Arguments.of(95, 90, 93, 'A'),
                Arguments.of(100, 85, 96, 'A'),
                Arguments.of(92, 93, 94, 'A'),
                Arguments.of(100, 100, 100, 'A'),

                // B
                Arguments.of(70, 70, 100, 'B'),
                Arguments.of(82, 85, 87, 'B'),
                Arguments.of(84, 79, 85, 'B'),

                // C
                Arguments.of(70, 70, 70, 'C'),
                Arguments.of(75, 70, 79, 'C'),
                Arguments.of(60, 82, 76, 'C'),

                // D
                Arguments.of(65, 70, 59, 'D'),
                Arguments.of(66, 62, 68, 'D'),
                Arguments.of(58, 62, 70, 'D'),

                // F
                Arguments.of(44, 55, 52, 'F'),
                Arguments.of(48, 55, 52, 'F'),
                Arguments.of(58, 59, 60, 'F'),
                Arguments.of(0, 0, 0, 'F')
        );
    }
}