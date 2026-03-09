package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Array Plus Array
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Вернуть сумму всех элементов двух массивов.
 *
 *  📊 Примеры:
 *     [1,2,3] + [4,5,6] → 21
 *     [-1,-2,-3] + [-4,-5,-6] → -21
 *
 *  ⚡ Решение:
 *
 *     Используется линейная агрегация.
 *
 *     Сначала суммируем элементы первого массива,
 *     затем второго.
 *
 *     Почему это лучшее решение:
 *
 *     1️⃣ Нет дополнительных аллокаций
 *     2️⃣ Только sequential memory access
 *     3️⃣ Простые for loops оптимально компилируются JIT
 *     4️⃣ Cache-friendly доступ к памяти
 *
 *  📈 Сложность:
 *
 *     O(n + m) время
 *     O(1) память
 *
 *  🔗 https://www.codewars.com/kata/5a2be17aee1aaefe2a000151
 *
 */
public final class ArrayPlusArray {

    private ArrayPlusArray() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Возвращает сумму элементов двух массивов.
     */
    public static int arrayPlusArray(final int[] arr1, final int[] arr2) {

        int sum = 0;

        // Суммируем первый массив
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }

        // Суммируем второй массив
        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
        }

        return sum;
    }
}