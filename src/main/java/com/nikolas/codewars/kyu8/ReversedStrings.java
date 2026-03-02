package com.nikolas.codewars.kyu8;

/**
 * <h3>🎯 Codewars: <a href="https://www.codewars.com/kata/5168bb5dfe9a00b126000018">Reversed Strings</a></h3>
 *
 * <p><strong>📋 Задача:</strong> Развернуть строку задом наперёд со <strong>поддержкой Unicode</strong> (эмодзи, CJK).</p>
 *
 * <details>
 *   <summary><strong>📊 Примеры</strong> <code>(+/-0)</code></summary>
 *
 * ```java
 * solution("hello")     ➜ "olleh"
 * solution("world")     ➜ "dlrow"
 * solution("12345")     ➜ "54321"
 * solution("👨‍👩‍👧‍👦") ➜ "👦‍👧‍👩‍👨"
 * ```
 * </details>
 *
 * <hr>
 */
public final class ReversedStrings {

    private ReversedStrings() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * <h4>⚡ Алгоритм: StringBuilder#reverse()</h4>
     * <p><code>new StringBuilder(str).reverse().toString()</code> — **единственный безопасный способ**:
     * <ul>
     *   <li>✅ <strong>Unicode-aware</strong> — суррогатные пары</li>
     *   <li>✅ <strong>1 проход</strong> памяти</li>
     *   <li>✅ <strong>0 ручных swap</strong> операций</li>
     * </ul>
     *
     * <details>
     *   <summary><strong>🔍 Почему НЕ char[] swap</strong></summary>
     *
     * ```java
     * // ❌ ЛОМАЕТ ЭМОДЗИ (суррогатные пары)
     * char[] chars = str.toCharArray();
     * for (int i = 0; i < chars.length / 2; i++) {
     *     char tmp = chars[i];
     *     chars[i] = chars[chars.length - 1 - i];
     *     chars[chars.length - 1 - i] = tmp;
     * }
     * return new String(chars);
     *
     * // 👨‍👩‍👧‍👦 → 👧‍👩‍👨‍👦❌ (сломано!)
     * ```
     * </details>
     *
     * <h5>📈 Сложность</h5>
     * <table>
     *   <tr><th>Время</th><th>Память</th></tr>
     *   <tr><td><strong>O(n)</strong></td><td><strong>O(n)</strong></td></tr>
     * </table>
     *
     * <h5>✅ Преимущества StringBuilder</h5>
     * <ul>
     *   <li>🔥 <strong>Эмодзи‑безопасно</strong></li>
     *   <li>🔥 <strong>CJK‑символы</strong> (4 байта)</li>
     *   <li>🔥 <strong>Apache/MIT лицензия</strong></li>
     * </ul>
     *
     * @param str произвольная Unicode‑строка
     * @return развёрнутая строка (Unicode‑correct)
     */
    public static String solution(final String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
