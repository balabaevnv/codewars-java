package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Проверяет, делится ли число n на два числа x и y")
class IsNDivisibleByXAndYTest {

    @ParameterizedTest(name = "isDivisible({0}, {1}, {2}) → {3}")
    @CsvSource({
            "12, 4, 3, true",   // 12 делится на 4 и 3
            "3, 3, 4, false",   // 3 не делится на 4
            "12, 2, 6, true",   // 12 делится на 2 и 6
            "100, 5, 3, false", // 100 не делится на 3
            "12, 7, 5, false"   // 12 не делится на 7 и 5
    })
    void testDivisibility(long n, long x, long y, boolean expected) {
        assertThat(IsNDivisibleByXAndY.isDivisible(n, x, y)).isEqualTo(expected);
    }
}