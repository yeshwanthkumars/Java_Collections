package com.yesh.java.collection.queue;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDequeExample {
    public static void main(String[] args) {
        // Create a Deque using LinkedList
        Deque<Integer> deque = new LinkedList<>();

        // Add elements to the deque
        deque.addFirst(10);
        deque.addLast(20);
        deque.addLast(30);

        // Display the deque
        System.out.println("Deque: " + deque); // Output: [10, 20, 30]

        // Retrieve and remove elements
        System.out.println("Removed First: " + deque.pollFirst()); // Output: 10
        System.out.println("Removed Last: " + deque.pollLast());   // Output: 30

        // Add and display
        deque.addFirst(40);
        System.out.println("Deque after adding: " + deque); // Output: [40, 20]
    }
}
