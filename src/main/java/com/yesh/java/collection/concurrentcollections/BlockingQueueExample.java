package com.yesh.java.collection.concurrentcollections;

import java.util.concurrent.*;

public class BlockingQueueExample {

    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(2);

        new Thread(() -> {
            try {
                queue.put(1);
                queue.put(2);
                queue.put(3); // waits
            } catch(Exception e){}
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println(queue.take());
            } catch(Exception e){}
        }).start();
    }
}
