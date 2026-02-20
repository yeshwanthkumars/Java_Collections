package com.yesh.java.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();

        // Adding key-value pairs
        map.put(3, "Lion");
        map.put(1, "Elephant");
        map.put(2, "Tiger");

        // Display the map
        System.out.println("TreeMap: " + map); // Output: {1=Elephant, 2=Tiger, 3=Lion}

        // Get a value
        System.out.println("Value for key 2: " + map.get(2)); // Output: Tiger
    }
}

