package com.nikolas.codewars.kyu8;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class GravityFlipTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void testFlip(char dir, int[] input, int[] expected) {
        assertThat(GravityFlip.flip(dir, input)).isEqualTo(expected);
    }

    static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{'R', new int[]{3,2,1,2}, new int[]{1,2,2,3}},
                new Object[]{'L', new int[]{1,4,5,3,5}, new int[]{5,5,4,3,1}},
                new Object[]{'R', new int[]{}, new int[]{}},
                new Object[]{'L', new int[]{7}, new int[]{7}},
                new Object[]{'R', new int[]{2,2,2,2}, new int[]{2,2,2,2}}
        );
    }
}