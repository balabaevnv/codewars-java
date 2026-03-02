package com.nikolas.codewars.kyu8;

/**
 * Codewars:
 * <a href="https://www.codewars.com/kata/5715eaedb436cf5606000381">Sum of positive</a>
 *
 * <p>Возвращает сумму всех положительных чисел в массиве.</p>
 */
public final class SumOfPositive {

    private SumOfPositive() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Время:  O(n) — один проход по массиву
     * Память: O(1) — единственная переменная-аккумулятор, ноль аллокаций
     *
     * <p>For-each цикл с условием: если элемент положительный — добавляем к сумме.
     * Пустой массив и массив из отрицательных чисел корректно возвращают 0.</p>
     *
     * @param arr массив целых чисел
     * @return сумма положительных элементов (0 если таких нет)
     */
    public static int sum(final int[] arr) {
        // Аккумулятор — единственная переменная
        int sum = 0;
        for (final int n : arr) {
            if (n > 0) {
                sum += n;
            }
        }
        return sum;
    }
}