package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Area or Perimeter
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Нужно вычислить площадь квадрата, если длина и ширина равны, или периметр прямоугольника, если они разные.
 *
 *  ⚡ Решение:
 *     Мы просто проверяем равенство сторон и выбираем соответствующую операцию.
 *
 *  📈 Сложность: O(1)
 *
 *  🔗 https://www.codewars.com/kata/5ab6538b379d20ad880000ab/train/java
 */
public final class AreaOrPerimeter {

    private AreaOrPerimeter() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Вычисляет площадь квадрата или периметр прямоугольника.
     *
     * @param l длина
     * @param w ширина
     * @return площадь квадрата или периметр прямоугольника
     */
    public static int areaOrPerimeter(int l, int w) {
        if (l == w) {
            return l * w;  // Площадь квадрата
        }
        return 2 * (l + w);  // Периметр прямоугольника
    }
}