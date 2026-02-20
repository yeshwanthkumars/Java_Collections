package com.yesh.java.collection.queue;

import java.util.PriorityQueue;
import java.util.Comparator;

public class CustomPriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue with custom comparator (descending order)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // Add elements
        pq.add(50);
        pq.add(20);
        pq.add(10);
        pq.add(40);
        pq.add(30);

        // Display the PriorityQueue
        System.out.println("Custom PriorityQueue: " + pq); // Output: [50, 40, 30, 20, 10]

        // Retrieve and remove the head element
        System.out.println("Polled Element: " + pq.poll()); // Output: 50
        System.out.println("PriorityQueue after poll: " + pq); // Output: [40, 30, 20, 10]
    }
}
