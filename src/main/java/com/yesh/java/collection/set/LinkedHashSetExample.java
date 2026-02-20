package com.yesh.java.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet of Strings
        LinkedHashSet<String> cities = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");

        // Maintain insertion order
        System.out.println("Cities: " + cities); // [New York, London, Tokyo]

        // Add duplicate element (ignored)
        cities.add("London");
        System.out.println("After adding duplicate: " + cities); // [New York, London, Tokyo]

        // Check if an element exists
        System.out.println("Contains 'Tokyo'? " + cities.contains("Tokyo")); // true

        // Remove an element
        cities.remove("New York");
        System.out.println("After removing New York: " + cities); // [London, Tokyo]

        // Check size of the LinkedHashSet
        System.out.println("Size of the set: " + cities.size()); // 2

        // Iterate over elements
        System.out.println("Iterating over LinkedHashSet:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Clear the LinkedHashSet
        cities.clear();
        System.out.println("Is the set empty? " + cities.isEmpty()); // true
    }
}
