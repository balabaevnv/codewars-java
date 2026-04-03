package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PushAHashAnObjectIntoArrayTest {

    @Test
    void testSomething() {
        List<String> items = PushAHashAnObjectIntoArray.push();
        assertEquals(1, items.size());
        assertEquals("an object", items.get(0));
    }
}