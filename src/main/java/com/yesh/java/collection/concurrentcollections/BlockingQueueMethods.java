package com.yesh.java.collection.concurrentcollections;

import java.util.concurrent.*;

public class BlockingQueueMethods {

    public static void main(String[] args) throws Exception {

        BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);

        // add() - throws exception if full
        queue.add("A");
        queue.add("B");

        // offer() - returns false if full
        System.out.println(queue.offer("C")); // false

        // put() - blocks if full
        new Thread(() -> {
            try {
                queue.put("C"); // waits
            } catch(Exception e){}
        }).start();

        Thread.sleep(2000);

        // take() - blocks if empty
        System.out.println(queue.take());

        // poll() - returns null if empty
        System.out.println(queue.poll());

        // peek()
        System.out.println(queue.peek());
    }
}
