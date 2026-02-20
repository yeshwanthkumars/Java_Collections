package com.yesh.java.collection.list;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Print the ArrayList
        System.out.println("Fruits: " + fruits); // [Apple, Banana, Cherry]

        // Get an element
        System.out.println("First fruit: " + fruits.get(0)); // Apple

        // Add an element at a specific index
        fruits.add(1, "Blueberry");
        System.out.println("After adding Blueberry: " + fruits); // [Apple, Blueberry, Banana, Cherry]

        // Replace an element
        fruits.set(2, "Blackberry");
        System.out.println("After replacing Banana: " + fruits); // [Apple, Blueberry, Blackberry, Cherry]

        // Remove an element by index
        fruits.remove(1);
        System.out.println("After removing Blueberry: " + fruits); // [Apple, Blackberry, Cherry]

        // Check size
        System.out.println("Size of the list: " + fruits.size()); // 3

        // Check if the list contains an element
        System.out.println("Contains 'Apple'? " + fruits.contains("Apple")); // true

        // Clear the list
        fruits.clear();
        System.out.println("Is the list empty? " + fruits.isEmpty()); // true
    }
}
