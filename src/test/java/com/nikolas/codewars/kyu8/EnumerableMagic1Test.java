package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.function.IntPredicate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class EnumerableMagic1Test {

    private static final IntPredicate evenNumber = n -> n % 2 == 0;
    private static final IntPredicate oddNumber = n -> n % 2 != 0;
    private static final IntPredicate lessThan10 = n -> n < 10;
    private static final IntPredicate lessThan5 = n -> n < 5;
    private static final IntPredicate greaterThan1 = n -> n > 1;
    private static final IntPredicate greaterThan5 = n -> n > 5;
    private static final IntPredicate greaterThan10 = n -> n > 10;

    // ---- Валидные случаи (из условия) ----
    @Test
    void fixedTests() {
        assertTrue(EnumerableMagic1.all(new int[]{2, 4, 6, 10}, evenNumber));
        assertFalse(EnumerableMagic1.all(new int[]{1, 3, 5, 10}, oddNumber));
        assertFalse(EnumerableMagic1.all(new int[]{2, 4, 6, 19}, lessThan10));
        assertTrue(EnumerableMagic1.all(new int[]{1, 1, 2}, lessThan5));
        assertTrue(EnumerableMagic1.all(new int[]{2, 9, 4, 3}, greaterThan1));
        assertFalse(EnumerableMagic1.all(new int[]{2, 9, 4, 0}, greaterThan1));
        assertFalse(EnumerableMagic1.all(new int[]{5, 6, 7, 8}, greaterThan5));
        assertTrue(EnumerableMagic1.all(new int[]{13, 42}, greaterThan10));

        assertFalse(EnumerableMagic1.all(new int[]{5}, evenNumber));
        assertTrue(EnumerableMagic1.all(new int[]{5}, oddNumber));
        assertFalse(EnumerableMagic1.all(new int[]{5}, lessThan5));

        assertTrue(EnumerableMagic1.all(new int[]{}, evenNumber));
        assertTrue(EnumerableMagic1.all(new int[]{}, lessThan5));
        assertTrue(EnumerableMagic1.all(new int[]{}, greaterThan10));
    }

    // ---- Случайные тесты ----
    @Test
    void randomTests() {
        for (int t = 0; t < 100; t++) {
            int size = (int) (Math.random() * 20);
            int[] list = new int[size];
            for (int i = 0; i < size; i++) {
                list[i] = (int) (Math.random() * 200) - 100; // от -100 до 99
            }
            // случайный предикат
            IntPredicate predicate = n -> n % 2 == 0; // для примера, можно разнообразить
            boolean expected = referenceAll(list, predicate);
            assertEquals(expected, EnumerableMagic1.all(list, predicate));
        }
    }

    // Эталонная реализация (цикл)
    private boolean referenceAll(int[] list, IntPredicate predicate) {
        if (list == null) return true;
        for (int num : list) {
            if (!predicate.test(num)) return false;
        }
        return true;
    }
}