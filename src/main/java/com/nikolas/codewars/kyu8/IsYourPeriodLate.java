package com.nikolas.codewars.kyu8;

import java.time.LocalDate;

/**
 * Codewars Kata: Is your period late?
 *
 * 🔗 https://www.codewars.com/kata/578a8a01e9fd1549e50001f1/train/java
 *
 * Pattern: Вычисление разницы между датами
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class IsYourPeriodLate {

    private IsYourPeriodLate() {}

    /**
     * Определяет, наступила ли задержка цикла.
     *
     * @param last        дата последней менструации
     * @param today       текущая дата
     * @param cycleLength длина цикла в днях
     * @return true, если дней прошло больше длины цикла, иначе false
     * @throws IllegalArgumentException если любой из параметров даты null
     */
    public static boolean periodIsLate(LocalDate last, LocalDate today, int cycleLength) {
        return today.toEpochDay() - last.toEpochDay() > cycleLength;
    }
}