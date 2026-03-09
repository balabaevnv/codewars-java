package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 *
 * Function 2 - squaring an argument
 *
 * 🔗 https://www.codewars.com/kata/523b623152af8a30c6000027/train/java
 *
 * Задача:
 * Вернуть квадрат числа.
 *
 * Формула:
 * n² = n * n
 *
 * Почему не Math.pow:
 * - Math.pow работает с double
 * - значительно медленнее
 * - лишние преобразования типов
 *
 * Лучшее решение — обычное умножение.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public final class Function2SquaringAnArgument {

    private Function2SquaringAnArgument() {
        // utility class
    }

    public static int square(int n) {

        // возвращаем квадрат числа
        return n * n;
    }
}