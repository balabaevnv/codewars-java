package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CSVRepresentationOfArrayTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(
                        new int[][]{
                                {0,1,2,3,45},
                                {10,11,12,13,14},
                                {20,21,22,23,24},
                                {30,31,32,33,34}
                        },
                        "0,1,2,3,45\n10,11,12,13,14\n20,21,22,23,24\n30,31,32,33,34"
                ),
                Arguments.of(
                        new int[][]{
                                {-25,21,2,-33,48},
                                {30,31,-32,33,-34}
                        },
                        "-25,21,2,-33,48\n30,31,-32,33,-34"
                )
        );
    }

    @ParameterizedTest(name = "[{index}] valid case")
    @MethodSource("validCases")
    void validTests(int[][] input, String expected){

        assertEquals(expected,
                CSVRepresentationOfArray.toCsvText(input));
    }

    static Stream<Arguments> edgeCases(){
        return Stream.of(
                Arguments.of(new int[][]{{1}}, "1"),
                Arguments.of(new int[][]{{1,2,3}}, "1,2,3"),
                Arguments.of(new int[][]{{1},{2},{3}}, "1\n2\n3")
        );
    }

    @ParameterizedTest(name = "[{index}] edge case")
    @MethodSource("edgeCases")
    void edgeTests(int[][] input, String expected){

        assertEquals(expected,
                CSVRepresentationOfArray.toCsvText(input));
    }

    static Stream<Arguments> invalidCases(){
        return Stream.of();
    }

    @Test
    void randomTests(){

        for(int n = 1; n <= 20; n++){

            int[][] arr = new int[n][n];

            StringBuilder expected = new StringBuilder();

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    arr[i][j] = i + j;
                    expected.append(i + j);

                    if(j < n - 1) expected.append(',');
                }
                if(i < n - 1) expected.append('\n');
            }

            assertEquals(expected.toString(),
                    CSVRepresentationOfArray.toCsvText(arr));
        }
    }
}