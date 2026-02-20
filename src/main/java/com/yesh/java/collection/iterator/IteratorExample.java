package com.yesh.java.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        // Create a list
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Get the iterator
        Iterator<String> iterator = list.iterator();

        // Iterate through the list
        System.out.println("Using Iterator:");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);

            // Remove an element conditionally
            if (element.equals("Banana")) {
                iterator.remove();
            }
        }

        System.out.println("List after removal: " + list); // Output: [Apple, Cherry]
    }
}
