package com.nikolas.codewars.kyu8;

/**
 * <h3>🎯 Codewars: <a href="https://www.codewars.com/kata/53369039d7ab3ac506000467">Convert boolean values to strings 'Yes' or 'No'</a></h3>
 *
 * <p><strong>📋 Задача:</strong> Преобразовать boolean в строку: <code>true ➜ "Yes"</code>, <code>false ➜ "No"</code>.</p>
 *
 * <details>
 *   <summary><strong>📊 Примеры</strong> <code>(+/-0)</code></summary>
 *
 * ```java
 * boolToWord(true)   ➜ "Yes"
 * boolToWord(false)  ➜ "No"
 * ```
 * </details>
 *
 * <hr>
 */
public final class ConvertBooleanValuesToStringsYesOrNo {

    private ConvertBooleanValuesToStringsYesOrNo() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * <h4>⚡ Алгоритм</h4>
     * <p><code>b ? "Yes" : "No"</code> — тернарный оператор:
     * <ul>
     *   <li>✅ <strong>1 инструкция</strong> ветвления</li>
     *   <li>✅ <code>String Pool</code> — <strong>0 аллокаций</strong></li>
     *   <li>✅ <strong>Идемпотентно</strong> для повторных вызовов</li>
     * </ul>
     *
     * <h5>📈 Сложность</h5>
     * <table>
     *   <tr><th>Время</th><th>Память</th></tr>
     *   <tr><td><strong>O(1)</strong></td><td><strong>O(1)</strong></td></tr>
     * </table>
     *
     * <details>
     *   <summary><strong>🔍 Альтернативы</strong></summary>
     *
     * ```java
     * // ❌ Длиннее
     * return b ? "Yes" : "No";
     *
     * // ❌ Аллоцирует StringBuilder
     * return String.valueOf(b);
     * ```
     * </details>
     *
     * @param b булево значение
     * @return <code>"Yes"</code> или <code>"No"</code>
     */
    public static String boolToWord(final boolean b) {
        return b ? "Yes" : "No";
    }
}
