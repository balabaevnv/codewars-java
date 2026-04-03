package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DinglemouseTest {
    @Test
    void test() {
        assertEquals(123, Dinglemouse.INST.plus100(23));
    }
}