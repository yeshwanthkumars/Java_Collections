package com.yesh.java.collection.map;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new ConcurrentHashMap<>();

        // Adding key-value pairs
        map.put(1, "Physics");
        map.put(2, "Chemistry");
        map.put(3, "Mathematics");

        map.putIfAbsent(4,"Computer Science");
        map.putIfAbsent(4,"Social");
        map.putIfAbsent(5,"EVS");
        map.put(7,"Chemistry");
        map.put(8,"English");
        map.put(9,"Tamil");

        // Display the map
        System.out.println("ConcurrentHashMap: " + map); // Output: {1=Physics, 2=Chemistry, 3=Mathematics}

        // Check if a value exists
        System.out.println("Contains 'Physics'? " + map.containsValue("Physics")); // Output: true

        map.remove(9,"English");
        map.replace(9,"English","Tamil");

        System.out.println(map);
    }
}
