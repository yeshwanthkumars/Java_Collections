package com.yesh.java.collection.iterable;

import java.util.ArrayList;

public class IterableExample {
    public static void main(String[] args) {
        // Create a list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Use for-each loop (enabled by Iterable)
        System.out.println("Using for-each loop:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}