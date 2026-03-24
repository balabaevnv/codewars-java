package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SmallestUnusedIDTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(new int[]{0,1,2,3,5}, 4),
                Arguments.of(new int[]{1,2,0,2,3}, 4),
                Arguments.of(new int[]{1,2,0,2,3,5}, 4),
                Arguments.of(new int[]{0,1,2,3,4,5,6,7,8,9,10}, 11),
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{0,0,0,1,1,2}, 3)
        );
    }

    @ParameterizedTest(name = "[{index}] ids={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(int[] ids, int expected){
        assertEquals(expected, SmallestUnusedID.nextId(ids));
    }

    @Test
    void randomTests() {
        int[] ids = new int[100];
        for(int i=0;i<100;i++) ids[i]=i*2;
        assertEquals(1, SmallestUnusedID.nextId(ids));

        ids = new int[]{0,2,4,5,6};
        assertEquals(1, SmallestUnusedID.nextId(ids));
    }
}