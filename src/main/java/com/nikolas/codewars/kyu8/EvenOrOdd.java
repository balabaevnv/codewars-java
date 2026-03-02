package com.nikolas.codewars.kyu8;

/**
 * <h3>🎯 Codewars: <a href="https://www.codewars.com/kata/53da3dbb4a5168369a0000fe">Even or Odd</a></h3>
 *
 * <p><strong>📋 Задача:</strong> Определить чётность целого числа: <code>Even</code> или <code>Odd</code>.</p>
 *
 * <details>
 *   <summary><strong>📊 Примеры</strong> <code>(+/-0)</code></summary>
 *
 * ```java
 * evenOrOdd(2)   ➜ "Even"
 * evenOrOdd(3)   ➜ "Odd"
 * evenOrOdd(-7)  ➜ "Odd"
 * evenOrOdd(0)   ➜ "Even"
 * ```
 * </details>
 *
 * <hr>
 */
public final class EvenOrOdd {

    private EvenOrOdd() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * <h4>⚡ Алгоритм: Побитовое И</h4>
     * <p><code>number & 1</code> проверяет **младший бит (LSB)**:
     * <ul>
     *   <li><code>Even</code>: LSB = <code>0</code> ➜ <code>&1 = 0</code></li>
     *   <li><code>Odd</code>:  LSB = <code>1</code> ➜ <code>&1 = 1</code></li>
     * </ul>
     *
     * <details>
     *   <summary><strong>🔍 Биты в действии</strong></summary>
     *
     * ```java
     * 2   = 0b...0010  & 0b0001 = 0b0000 ➜ Even
     * 3   = 0b...0011  & 0b0001 = 0b0001 ➜ Odd
     * -7  = 0b...1001  & 0b0001 = 0b0001 ➜ Odd
     * 0   = 0b...0000  & 0b0001 = 0b0000 ➜ Even
     * ```
     * </details>
     *
     * <h5>📈 Сложность</h5>
     * <table>
     *   <tr><th>Время</th><th>Память</th></tr>
     *   <tr><td><strong>O(1)</strong></td><td><strong>O(1)</strong></td></tr>
     * </table>
     *
     * <h5>✅ Преимущества</h5>
     * <ul>
     *   <li>🔥 <strong>1 CPU инструкция</strong></li>
     *   <li>✅ Работает с <strong>отрицательными</strong></li>
     *   <li>✅ <strong>0 аллокаций</strong></li>
     *   <li>✅ <strong>String Pool</strong></li>
     * </ul>
     *
     * @param number целое число (-2³¹..2³¹-1)
     * @return <code>"Even"</code> или <code>"Odd"</code>
     */
    public static String evenOrOdd(final int number) {
        return (number & 1) == 0 ? "Even" : "Odd";
    }
}
