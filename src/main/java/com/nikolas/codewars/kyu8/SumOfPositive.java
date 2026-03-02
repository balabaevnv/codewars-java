package com.nikolas.codewars.kyu8;

/**
 * <h3>🎯 Codewars: <a href="https://www.codewars.com/kata/5715eaedb436cf5606000381">Sum of positive</a></h3>
 *
 * <p><strong>📋 Задача:</strong> Вернуть сумму всех <strong>положительных</strong> элементов массива (≤0 игнорируются).</p>
 *
 * <details>
 *   <summary><strong>📊 Примеры</strong> <code>(+/-0)</code></summary>
 *
 * ```java
 * sum()     ➜ 15[1][2][3][4][5]
 * sum([1,-2,+3,-4,+5]) ➜ 9
 * sum([-1,0,0,0])      ➜ 0
 * sum([])              ➜ 0
 * ```
 * </details>
 *
 * <hr>
 */
public final class SumOfPositive {

    private SumOfPositive() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * <h4>⚡ Алгоритм: Однопроходный аккумулятор</h4>
     * <p><strong>For-each + guard clause</strong> — классика:
     * <ul>
     *   <li>✅ <strong>1 проход</strong> — O(n)</li>
     *   <li>✅ <strong>1 переменная</strong> — O(1)</li>
     *   <li>✅ <strong>null‑safe</strong> (пустой массив = 0)</li>
     * </ul>
     *
     * <details>
     *   <summary><strong>🔍 Пошаговый разбор</strong></summary>
     *
     * ```java
     * int[] arr = {1, -2, 3, -4, 5};
     * int sum = 0;
     * // Проход 1: 1 > 0 ➜ sum=1
     * // Проход 2: -2≤0 ➜ пропуск
     * // Проход 3: 3 > 0 ➜ sum=4
     * // Проход 4: -4≤0 ➜ пропуск
     * // Проход 5: 5 > 0 ➜ sum=9
     * ```
     * </details>
     *
     * <h5>📈 Сложность</h5>
     * <table>
     *   <tr><th>Время</th><th>Память</th></tr>
     *   <tr><td><strong>O(n)</strong></td><td><strong>O(1)</strong></td></tr>
     * </table>
     *
     * <h5>✅ Почему лучше Stream API</h5>
     * <details>
     *   <summary>Производительность</summary>
     *
     * | Метод | Время | Память | Аллокаций |
     * |-------|-------|--------|------------|
     * | <code>for-each</code> | **O(n)** | **O(1)** | **0** |
     * | <code>Arrays.stream().filter().sum()</code> | **O(n log n)** | **O(n)** | **~10** |
     * </details>
     *
     * @param arr массив целых чисел (может быть пустым)
     * @return сумма положительных (>0) элементов, 0 если нет
     */
    public static int sum(final int[] arr) {
        int sum = 0;
        for (final int n : arr) {
            if (n > 0) {
                sum += n;
            }
        }
        return sum;
    }
}
