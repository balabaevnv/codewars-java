package com.nikolas.codewars.kyu8;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class WelcomeToTheCityTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void testSayHello(String[] name, String city, String state, String expected) {
        assertThat(WelcomeToTheCity.sayHello(name, city, state)).isEqualTo(expected);
    }

    static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{new String[]{"John", "Smith"}, "Phoenix", "Arizona", "Hello, John Smith! Welcome to Phoenix, Arizona!"},
                new Object[]{new String[]{"Jane"}, "Dallas", "Texas", "Hello, Jane! Welcome to Dallas, Texas!"},
                new Object[]{new String[]{"O'Neil", "Jr."}, "New York", "New York", "Hello, O'Neil Jr.! Welcome to New York, New York!"}
        );
    }
}