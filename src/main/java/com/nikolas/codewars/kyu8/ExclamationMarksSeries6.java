package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Exclamation Marks Series #6
 *
 * 🔗 https://www.codewars.com/kata/57faf7275c991027af000679/train/java
 *
 * Pattern:
 * String manipulation / deletion
 *
 * Complexity:
 * Time  : O(s)
 * Memory: O(s)
 */
public final class ExclamationMarksSeries6 {

    private ExclamationMarksSeries6() {}

    public static String remove(String s, int n){
        StringBuilder sb = new StringBuilder(s.length());
        int removed = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '!' && removed < n){
                removed++;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}