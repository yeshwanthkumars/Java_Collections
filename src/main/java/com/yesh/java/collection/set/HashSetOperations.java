package com.yesh.java.collection.set;

import java.util.HashSet;

public class HashSetOperations {
    public static void main(String[] args) {
        // Create two HashSets
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // Add elements to set1
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Add elements to set2
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Union
        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union); // [1, 2, 3, 4]

        // Intersection
        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection); // [2, 3]

        // Difference
        HashSet<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference: " + difference); // [1]
    }
}
