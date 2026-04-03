package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: "this" is a problem
 *
 * 🔗 https://www.codewars.com/kata/547c71fdc5b2b38db1000098/train/java
 *
 * Pattern: Инкапсуляция, геттеры
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class ThisIsAProblem {
    private final String firstName;
    private final String lastName;
    private final String fullName;

    public ThisIsAProblem(String first, String last) {
        this.firstName = first;
        this.lastName = last;
        this.fullName = (first == null ? "null" : first) + " " + (last == null ? "null" : last);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }
}