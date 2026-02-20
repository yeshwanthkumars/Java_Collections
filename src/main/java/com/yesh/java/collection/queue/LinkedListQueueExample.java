package com.yesh.java.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Add elements to the Queue
        queue.add("John");
        queue.add("Alice");
        queue.add("Bob");

        // Display the Queue
        System.out.println("Queue: " + queue); // Output: [John, Alice, Bob]

        // Retrieve and remove the head element
        System.out.println("Removed: " + queue.poll()); // Output: John
        System.out.println("Queue after poll: " + queue); // Output: [Alice, Bob]

        // Retrieve, but do not remove, the head element
        System.out.println("Head of the Queue: " + queue.peek()); // Output: Alice

        // Check if the queue contains an element
        System.out.println("Contains 'Bob'? " + queue.contains("Bob")); // Output: true

        // Retrieve and remove the head element using remove()
        System.out.println("Removed using remove(): " + queue.remove()); // Output: Alice

        // Display the final state of the queue
        System.out.println("Queue after remove: " + queue); // Output: [Bob]

        // Clear the queue
        queue.clear();
        System.out.println("Is the queue empty? " + queue.isEmpty()); // Output: true
    }
}
