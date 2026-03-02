package com.nikolas.codewars.kyu8;

/**
 * <h3>🎯 Codewars: <a href="https://www.codewars.com/kata/56dec885c54a926dcd001095">Opposite number</a></h3>
 *
 * <p><strong>📋 Задача:</strong> Вернуть аддитивную инверсию числа (<code>+n ➜ -n</code>, <code>-n ➜ +n</code>).</p>
 *
 * <details>
 *   <summary><strong>📊 Примеры</strong> <code>(+/-0)</code></summary>
 *
 * ```java
 * opposite(4)   ➜ -4
 * opposite(-7)  ➜ 7
 * opposite(0)   ➜ 0
 * ```
 * </details>
 *
 * <hr>
 */
public final class OppositeNumber {

    private OppositeNumber() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * <h4>⚡ Алгоритм: Унарный минус</h4>
     * <p><code>-number</code> = <strong>1 JVM инструкция {@code ineg}</strong>:
     * <ul>
     *   <li>🔥 <code>0</code> вызовов методов</li>
     *   <li>🔥 <code>0</code> ветвлений</li>
     *   <li>🔥 <code>0</code> аллокаций памяти</li>
     * </ul>
     *
     * <details>
     *   <summary><strong>🔍 Байткод JVM</strong></summary>
     *
     * ```java
     * // Компиляция -number:
     * ineg           // ← ОДНА инструкция!
     * ireturn
     * ```
     * </details>
     *
     * <h5>📈 Сложность</h5>
     * <table>
     *   <tr><th>Время</th><th>Память</th></tr>
     *   <tr><td><strong>O(1)</strong></td><td><strong>O(1)</strong></td></tr>
     * </table>
     *
     * <h5>✅ Почему лучше альтернатив</h5>
     * <details>
     *   <summary>Сравнение</summary>
     *
     * | Метод | Инструкций JVM | Аллокаций |
     * |-------|----------------|-----------|
     * | <code>-number</code> | **1** | **0** |
     * | <code>0-number</code> | **3** | **0** |
     * | <code>number * -1</code> | **4** | **0** |
     * </details>
     *
     * @param number целое число (-2³¹..2³¹-1)
     * @return противоположное число
     */
    public static int opposite(final int number) {
        return -number;
    }
}
