package com.yesh.java.collection.set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        // Print elements (sorted order)
        System.out.println("TreeSet: " + numbers); // Output: [10, 20, 30, 40, 50]

        // Check if an element exists
        System.out.println("Contains 20? " + numbers.contains(20)); // true

        // Retrieve first and last elements
        System.out.println("First Element: " + numbers.first()); // 10
        System.out.println("Last Element: " + numbers.last()); // 50

        // Retrieve higher and lower elements
        System.out.println("Higher than 30: " + numbers.higher(30)); // 40
        System.out.println("Lower than 30: " + numbers.lower(30)); // 20

        // Remove an element
        numbers.remove(20);
        System.out.println("After removing 20: " + numbers); // [10, 30, 40, 50]

        // Poll first and last elements
        System.out.println("Poll First: " + numbers.pollFirst()); // 10
        System.out.println("Poll Last: " + numbers.pollLast()); // 50
        System.out.println("TreeSet after polling: " + numbers); // [30, 40]
    }
}
