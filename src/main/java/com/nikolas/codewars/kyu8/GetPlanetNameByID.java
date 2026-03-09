package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Get Planet Name By ID
 *
 * 🔗 https://www.codewars.com/kata/515e188a311df01cba000003/train/java
 *
 * Pattern:
 * ID → Value Mapping (Constant Lookup)
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class GetPlanetNameByID {

    private GetPlanetNameByID() {
        // utility class
    }

    public static String getPlanetName(int id) {

        // Подождите, дайте проверю...
        // используем switch без fall-through

        return switch (id) {
            case 1 -> "Mercury";
            case 2 -> "Venus";
            case 3 -> "Earth";
            case 4 -> "Mars";
            case 5 -> "Jupiter";
            case 6 -> "Saturn";
            case 7 -> "Uranus";
            case 8 -> "Neptune";
            default -> null;
        };
    }
}