package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleFun1SeatsInTheaterTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(16,11,5,3,96),
                Arguments.of(1,1,1,1,0),
                Arguments.of(13,6,8,3,18),
                Arguments.of(60,100,60,1,99),
                Arguments.of(1000,1000,1000,1000,0)
        );
    }

    @ParameterizedTest(name = "[{index}] cols={0}, rows={1}, col={2}, row={3} -> expected={4}")
    @MethodSource("validCases")
    void validTests(int nCols, int nRows, int col, int row, int expected) {

        assertEquals(expected,
                SimpleFun1SeatsInTheater.seatsInTheater(nCols,nRows,col,row));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(5,5,5,5,0),
                Arguments.of(10,10,1,1,90)
        );
    }

    @ParameterizedTest(name = "[{index}] cols={0}, rows={1}, col={2}, row={3} -> expected={4}")
    @MethodSource("edgeCases")
    void edgeTests(int nCols, int nRows, int col, int row, int expected) {

        assertEquals(expected,
                SimpleFun1SeatsInTheater.seatsInTheater(nCols,nRows,col,row));
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of();
    }

    @Test
    void randomTests() {

        for (int i = 0; i < 100; i++) {

            int nCols = ThreadLocalRandom.current().nextInt(1,1000);
            int nRows = ThreadLocalRandom.current().nextInt(1,1000);

            int col = ThreadLocalRandom.current().nextInt(1,nCols+1);
            int row = ThreadLocalRandom.current().nextInt(1,nRows+1);

            int expected = (nRows - row) * (nCols - col + 1);

            int actual =
                    SimpleFun1SeatsInTheater.seatsInTheater(nCols,nRows,col,row);

            assertEquals(expected, actual);
        }
    }
}