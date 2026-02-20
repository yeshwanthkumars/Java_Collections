package com.yesh.java.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();

        // Adding key-value pairs
        map.put(1, "Dog");
        map.put(2, "Cat");
        map.put(3, "Rabbit");

        // Display the map
        System.out.println("LinkedHashMap: " + map); // Output: {1=Dog, 2=Cat, 3=Rabbit}

        // Access a value
        System.out.println("Value for key 3: " + map.get(3)); // Output: Rabbit
    }
}
