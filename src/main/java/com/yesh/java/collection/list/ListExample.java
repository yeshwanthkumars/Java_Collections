package com.yesh.java.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Create a List of Strings
        List<String> colors = new ArrayList<>();

        // Add elements to the List
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        // Print the List
        System.out.println("Colors: " + colors); // [Red, Blue, Green]

        // Add an element at a specific index
        colors.add(1, "Yellow");
        System.out.println("After adding Yellow: " + colors); // [Red, Yellow, Blue, Green]

        // Get an element by index
        System.out.println("Element at index 2: " + colors.get(2)); // Blue

        // Remove an element by index
        colors.remove(0);
        System.out.println("After removing first element: " + colors); // [Yellow, Blue, Green]

        // Replace an element
        colors.set(1, "Purple");
        System.out.println("After replacing Blue with Purple: " + colors); // [Yellow, Purple, Green]

        // Check if the List contains a specific element
        System.out.println("Contains 'Green'? " + colors.contains("Green")); // true

        // Find the index of an element
        System.out.println("Index of 'Purple': " + colors.indexOf("Purple")); // 1

        // Sublist example
        List<String> subList = colors.subList(0, 2);
        System.out.println("Sublist: " + subList); // [Yellow, Purple]

        // Clear the List
        colors.clear();
        System.out.println("Is the list empty? " + colors.isEmpty()); // true
    }
}
