package com.yesh.java.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetOperations {
    public static void main(String[] args) {
        // Create two LinkedHashSets
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();

        // Add elements to set1
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Add elements to set2
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Union
        LinkedHashSet<Integer> union = new LinkedHashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union); // [1, 2, 3, 4]

        // Intersection
        LinkedHashSet<Integer> intersection = new LinkedHashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection); // [2, 3]

        // Difference
        LinkedHashSet<Integer> difference = new LinkedHashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference: " + difference); // [1]
    }
}