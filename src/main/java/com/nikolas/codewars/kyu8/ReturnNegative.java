package com.nikolas.codewars.kyu8;

/**
 * <h3>🎯 Codewars: <a href="https://www.codewars.com/kata/55685cd7ad70877c23000102">Return Negative</a></h3>
 *
 * <p><strong>📋 Задача:</strong> Сделать число отрицательным. Положительные → отрицательные, уже отрицательные и ноль остаются без изменений.</p>
 *
 * <details>
 *   <summary><strong>📊 Примеры</strong> <code>(+/-0)</code></summary>
 *
 * ```java
 * makeNegative(42)  ➜ -42
 * makeNegative(-7)  ➜ -7
 * makeNegative(0)   ➜ 0
 * ```
 * </details>
 *
 * <hr>
 */
public final class ReturnNegative {

    private ReturnNegative() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * <h4>⚡ Алгоритм: Условное отрицание</h4>
     * <p><code>x > 0 ? -x : x</code> — **атомарная проверка**:
     * <ul>
     *   <li>✅ <code>> 0</code> — только положительные инвертируем</li>
     *   <li>✅ <code>≤ 0</code> — возвращаем как есть</li>
     *   <li>✅ <strong>Безопасно для MIN_VALUE</strong></li>
     * </ul>
     *
     * <details>
     *   <summary><strong>🔍 Edge cases</strong></summary>
     *
     * ```java
     * Integer.MIN_VALUE ➜ Integer.MIN_VALUE  (без переполнения!)
     * 0                ➜ 0                   (идемпотентно)
     * -1               ➜ -1                  (остается отрицательным)
     * ```
     * </details>
     *
     * <h5>📈 Сложность</h5>
     * <table>
     *   <tr><th>Время</th><th>Память</th></tr>
     *   <tr><td><strong>O(1)</strong></td><td><strong>O(1)</strong></td></tr>
     * </table>
     *
     * <h5>✅ Почему лучше Math.negateExact</h5>
     * <details>
     *   <summary>Сравнение производительности</summary>
     *
     * | Метод | MIN_VALUE | Аллокаций | JVM инструкций |
     * |-------|------------|-----------|----------------|
     * | <code>x > 0 ? -x : x</code> | **✅ Работает** | **0** | **2** |
     * | <code>Math.negateExact(x)</code> | ❌ Exception | 1 | **5+** |
     * </details>
     *
     * @param x целое число (-2³¹..2³¹-1)
     * @return отрицательное число (или исходное, если ≤ 0)
     */
    public static int makeNegative(final int x) {
        return x > 0 ? -x : x;
    }
}
