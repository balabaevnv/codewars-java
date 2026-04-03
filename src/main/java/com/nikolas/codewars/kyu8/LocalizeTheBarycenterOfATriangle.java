package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: Localize The Barycenter of a Triangle
 *
 * 🔗 https://www.codewars.com/kata/5601c5f6ba804403c7000004/train/java
 *
 * Pattern: Среднее арифметическое координат
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class LocalizeTheBarycenterOfATriangle {

    private LocalizeTheBarycenterOfATriangle() {}

    /**
     * Вычисляет центроид треугольника по координатам вершин.
     *
     * @param x координаты первой вершины [x1, y1]
     * @param y координаты второй вершины [x2, y2]
     * @param z координаты третьей вершины [x3, y3]
     * @return массив [x_centroid, y_centroid] с округлением до 4 знаков
     */
    public static double[] barTriang(double[] x, double[] y, double[] z) {
        double xO = (x[0] + y[0] + z[0]) / 3.0;
        double yO = (x[1] + y[1] + z[1]) / 3.0;
        // Округление до 4 знаков после запятой
        xO = Math.round(xO * 10000) / 10000.0;
        yO = Math.round(yO * 10000) / 10000.0;
        return new double[]{xO, yO};
    }
}