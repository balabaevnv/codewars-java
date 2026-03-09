package com.nikolas.codewars.kyu8;

import java.util.Map;

/**
 * Codewars Kata
 * Welcome!
 *
 * 🔗 https://www.codewars.com/kata/577ff15ad648a14b780000e7/train/java
 *
 * Pattern:
 * Key → Value Lookup
 *
 * Алгоритм:
 * 1. Используем Map<String,String> как базу данных языков
 * 2. Получаем перевод через getOrDefault
 * 3. Если язык неизвестен — возвращаем "Welcome"
 *
 * Сложность:
 * Time  : O(1)
 * Memory: O(n)
 */
public final class Welcome {

    private Welcome() {}

    // "база данных" языков
    private static final Map<String, String> DB = Map.ofEntries(
            Map.entry("english", "Welcome"),
            Map.entry("czech", "Vitejte"),
            Map.entry("danish", "Velkomst"),
            Map.entry("dutch", "Welkom"),
            Map.entry("estonian", "Tere tulemast"),
            Map.entry("finnish", "Tervetuloa"),
            Map.entry("flemish", "Welgekomen"),
            Map.entry("french", "Bienvenue"),
            Map.entry("german", "Willkommen"),
            Map.entry("irish", "Failte"),
            Map.entry("italian", "Benvenuto"),
            Map.entry("latvian", "Gaidits"),
            Map.entry("lithuanian", "Laukiamas"),
            Map.entry("polish", "Witamy"),
            Map.entry("spanish", "Bienvenido"),
            Map.entry("swedish", "Valkommen"),
            Map.entry("welsh", "Croeso")
    );

    public static String greet(String language){

        if (language == null) {
            return "Welcome";
        }

        return DB.getOrDefault(language, "Welcome");
    }
}