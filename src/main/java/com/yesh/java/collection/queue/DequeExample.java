package com.yesh.java.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        // Create a Deque using ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to the deque
        deque.addFirst("Alice");
        deque.addLast("Bob");
        deque.addFirst("John");

        // Display the deque
        System.out.println("Deque: " + deque); // Output: [John, Alice, Bob]

        // Retrieve and remove elements
        System.out.println("Removed First: " + deque.removeFirst()); // Output: John
        System.out.println("Removed Last: " + deque.removeLast());   // Output: Bob

        // Retrieve without removing elements
        System.out.println("First Element: " + deque.peekFirst());   // Output: Alice
        System.out.println("Last Element: " + deque.peekLast());     // Output: Alice

        // Clear the deque
        deque.clear();
        System.out.println("Is Deque Empty? " + deque.isEmpty());    // Output: true
    }
}
