package com.yesh.java.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue of integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(50);
        pq.add(20);
        pq.add(10);
        pq.add(40);
        pq.add(30);

        // Display the PriorityQueue
        System.out.println("PriorityQueue: " + pq); // Output: [10, 20, 30, 50, 40]

        // Retrieve and remove the head element
        System.out.println("Polled Element: " + pq.poll()); // Output: 10
        System.out.println("PriorityQueue after poll: " + pq); // Output: [20, 40, 30, 50]

        // Retrieve, but do not remove, the head element
        System.out.println("Peek Element: " + pq.peek()); // Output: 20

        // Remove a specific element
        pq.remove(40);
        System.out.println("PriorityQueue after removing 40: " + pq); // Output: [20, 50, 30]

        // Check if the queue contains an element
        System.out.println("Contains 30? " + pq.contains(30)); // Output: true

        // Clear the PriorityQueue
        pq.clear();
        System.out.println("Is the PriorityQueue empty? " + pq.isEmpty()); // Output: true
    }
}