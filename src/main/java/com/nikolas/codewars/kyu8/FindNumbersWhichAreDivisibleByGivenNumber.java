package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Find Numbers Which Are Divisible By Given Number
 *
 * 🔗 https://www.codewars.com/kata/55edaba99da3a9c84000003b/train/java
 *
 * Pattern:
 * Array Filtering
 *
 * Условие:
 * вернуть все числа массива, делящиеся на divider.
 *
 * Оптимальный подход:
 * 1 проход → считаем количество элементов
 * 2 проход → заполняем результат
 *
 * Это избегает:
 * - boxing (int → Integer)
 * - ArrayList
 *
 * Сложность:
 * Time  : O(n)
 * Memory: O(k)
 */
public final class FindNumbersWhichAreDivisibleByGivenNumber {

    private FindNumbersWhichAreDivisibleByGivenNumber() {}

    public static int[] divisibleBy(int[] numbers, int divider) {

        // Подождите, дайте проверю...
        // сначала считаем размер результирующего массива
        int count = 0;

        for (int n : numbers) {
            if (n % divider == 0) {
                count++;
            }
        }

        // создаем результат нужного размера
        int[] result = new int[count];

        // второй проход — заполняем массив
        int index = 0;

        for (int n : numbers) {
            if (n % divider == 0) {
                result[index++] = n;
            }
        }

        return result;
    }
}