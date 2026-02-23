package com.yesh.java.collection.concurrentcollections;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {

    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        queue.offer("Task1");
        queue.offer("Task2");
        queue.offer("Task3");
        queue.offer("Task4");

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.peek());

        ConcurrentLinkedQueue<Integer> queue1 = new ConcurrentLinkedQueue<>();

        queue1.offer(1);
        queue1.offer(2);
        queue1.offer(3);

        while(!queue1.isEmpty()) {
            System.out.println("Processing: " + queue1.poll());
        }


    }
}
