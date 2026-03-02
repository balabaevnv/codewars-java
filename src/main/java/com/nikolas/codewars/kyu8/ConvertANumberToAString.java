package com.nikolas.codewars.kyu8;

/**
 * <h3>🎯 Codewars: <a href="https://www.codewars.com/kata/5265326f5fda8eb1160004c8">Convert a Number to a String</a></h3>
 *
 * <p><strong>📋 Задача:</strong> Преобразовать целое число в строковое представление.</p>
 *
 * <details>
 *   <summary><strong>📊 Примеры</strong> <code>(+/-0)</code></summary>
 *
 * ```java
 * numberToString(123) ➜ "123"
 * numberToString(-7)  ➜ "-7"
 * numberToString(0)   ➜ "0"
 * ```
 * </details>
 *
 * <hr>
 */
public final class ConvertANumberToAString {

    private ConvertANumberToAString() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * <h4>⚡ Алгоритм</h4>
     * <p><code>Integer.toString(int)</code> — самый эффективный метод:
     * <ul>
     *   <li>❌ Без <code>String.valueOf()</code> обёрток</li>
     *   <li>❌ Без конкатенации строк</li>
     *   <li>❌ Без <code>StringBuilder</code></li>
     * </ul>
     *
     * <h5>📈 Сложность</h5>
     * <table>
     *   <tr><th>Время</th><th>Память</th></tr>
     *   <tr><td>O(d)</td><td>O(d)</td></tr>
     * </table>
     * где <code>d</code> — количество цифр числа.
     *
     * @param num целое число (-2³¹..2³¹-1)
     * @return строковое представление числа
     */
    public static String numberToString(final int num) {
        return Integer.toString(num);
    }
}
