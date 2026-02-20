package com.yesh.java.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Display the map
        System.out.println("HashMap: " + map); // Output: {1=Apple, 2=Banana, 3=Cherry}

        // Retrieve a value
        System.out.println("Value for key 2: " + map.get(2)); // Output: Banana

        // Check if a key exists
        System.out.println("Contains key 1? " + map.containsKey(1)); // Output: true

        // Remove a key-value pair
        map.remove(3);
        System.out.println("HashMap after removal: " + map); // Output: {1=Apple, 2=Banana}
    }
}
