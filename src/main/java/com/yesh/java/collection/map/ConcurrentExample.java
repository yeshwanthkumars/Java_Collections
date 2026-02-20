package com.yesh.java.collection.map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentExample {

    public static void main(String[] args) throws InterruptedException {

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                map.put("count", map.getOrDefault("count", 0) + 1);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(map);
    }
}

