package com.yesh.java.collection.set;

import java.util.TreeSet;
import java.util.Comparator;

public class CustomTreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet with a custom comparator (descending order)
        TreeSet<Integer> numbers = new TreeSet<>(Comparator.reverseOrder());

        // Add elements
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(50);
        numbers.add(40);

        // Print elements (custom sorted order)
        System.out.println("TreeSet with custom order: " + numbers); // [50, 40, 30, 20, 10]
    }
}
