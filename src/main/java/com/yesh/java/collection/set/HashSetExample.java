package com.yesh.java.collection.set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        HashSet<String> fruits = new HashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Add duplicate elements (ignored)
        fruits.add("Apple");

        // Print the HashSet
        System.out.println("Fruits: " + fruits); // Output may vary: [Banana, Cherry, Apple]

        // Check if an element exists
        System.out.println("Contains 'Banana'? " + fruits.contains("Banana")); // true

        // Remove an element
        fruits.remove("Cherry");
        System.out.println("After removing Cherry: " + fruits); // [Banana, Apple]

        // Check size of the set
        System.out.println("Size of the set: " + fruits.size()); // 2

        // Iterate over elements
        System.out.println("Iterating over HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clear the HashSet
        fruits.clear();
        System.out.println("Is the set empty? " + fruits.isEmpty()); // true
    }
}
