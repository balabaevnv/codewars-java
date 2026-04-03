package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: Find the force of gravity between two objects
 *
 * 🔗 https://www.codewars.com/kata/5b609ebc8f47bd595e000627/train/java
 *
 * Pattern: Преобразование единиц, вычисление силы
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class FindTheForceOfGravityBetweenTwoObjects {
    private FindTheForceOfGravityBetweenTwoObjects() {}

    private static final double G = 6.67e-11;

    public static double solution(double[] arrVal, String[] arrUnit) {
        double m1 = arrVal[0];
        double m2 = arrVal[1];
        double r = arrVal[2];

        m1 = toKg(m1, arrUnit[0]);
        m2 = toKg(m2, arrUnit[1]);
        r = toMeters(r, arrUnit[2]);

        return G * m1 * m2 / (r * r);
    }

    private static double toKg(double value, String unit) {
        return switch (unit) {
            case "kg" -> value;
            case "g" -> value * 0.001;
            case "mg" -> value * 1e-6;
            case "μg" -> value * 1e-9;
            case "lb" -> value * 0.453592;
            default -> value;
        };
    }

    private static double toMeters(double value, String unit) {
        return switch (unit) {
            case "m" -> value;
            case "cm" -> value * 0.01;
            case "mm" -> value * 0.001;
            case "μm" -> value * 1e-6;
            case "ft" -> value * 0.3048;
            default -> value;
        };
    }
}