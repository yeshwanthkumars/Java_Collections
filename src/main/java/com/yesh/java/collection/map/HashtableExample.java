package com.yesh.java.collection.map;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new Hashtable<>();

        // Adding key-value pairs
        map.put(1, "USA");
        map.put(2, "India");
        map.put(3, "China");

        // Display the map
        System.out.println("Hashtable: " + map); // Output: {3=China, 2=India, 1=USA}

        // Remove a key
        map.remove(3);
        System.out.println("Hashtable after removal: " + map); // Output: {2=India, 1=USA}
    }
}
