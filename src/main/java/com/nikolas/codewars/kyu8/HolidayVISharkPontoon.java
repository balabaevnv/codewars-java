package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Holiday VI - Shark Pontoon
 *
 * 🔗 https://www.codewars.com/kata/57e921d8b36340f1fd000059/train/java
 *
 * Pattern:
 * Time comparison (distance / speed)
 *
 * Подходы:
 * 1) Naive (double) — просто
 * 2) Optimal (int math) — fastest ✅
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class HolidayVISharkPontoon {

    private HolidayVISharkPontoon() {}

    public static String shark(int pontoonDistance, int sharkDistance,
                               int youSpeed, int sharkSpeed, boolean dolphin) {
        // youTime = pontoonDistance * sharkSpeed
        long youTime = (long) pontoonDistance * sharkSpeed;
        // sharkTime = sharkDistance * youSpeed
        long sharkTime = (long) sharkDistance * youSpeed;

        // Если есть дельфин, скорость акулы уменьшается вдвое,
        // что эквивалентно увеличению sharkTime в 2 раза.
        if (dolphin) {
            sharkTime *= 2;
        }

        return youTime < sharkTime ? "Alive!" : "Shark Bait!";
    }
}