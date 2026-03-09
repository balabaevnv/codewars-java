package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Array Plus Array")
class ArrayPlusArrayTest {

    @ParameterizedTest(name = "arrayPlusArray → {2}")
    @MethodSource("testCases")
    void shouldSumTwoArrays(int[] arr1, int[] arr2, int expected) {
        assertThat(ArrayPlusArray.arrayPlusArray(arr1, arr2)).isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3}, new int[]{4,5,6}, 21),
                Arguments.of(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}, -21),
                Arguments.of(new int[]{0,0,0}, new int[]{4,5,6}, 15),
                Arguments.of(new int[]{100,200,300}, new int[]{400,500,600}, 2100),
                Arguments.of(new int[]{}, new int[]{}, 0)
        );
    }
}