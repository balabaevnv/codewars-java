package com.nikolas.codewars.kyu8;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class HolidayVIIIDutyFreeTest {

    @ParameterizedTest(name = "{index} => normPrice={0}, discount={1}, hol={2}, expected={3}")
    @MethodSource("testCases")
    void testDutyFree(int normPrice, int discount, int hol, int expected) {
        assertThat(HolidayVIIIDutyFree.dutyFree(normPrice, discount, hol)).isEqualTo(expected);
    }

    static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{12, 50, 1000, 166},
                new Object[]{17, 10, 500, 294},
                new Object[]{24, 35, 3000, 357},
                new Object[]{1400, 35, 10000, 20},
                new Object[]{700, 26, 7000, 38},
                new Object[]{10, 10, 500, 500}  // дополнительный тест
        );
    }
}