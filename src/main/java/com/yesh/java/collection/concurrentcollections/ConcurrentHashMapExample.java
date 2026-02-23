package com.yesh.java.collection.concurrentcollections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();

        map.put("Java", 1);
        map.putIfAbsent("Java", 2);  // Won't replace

        System.out.println(map); // {Java=1}

        map.computeIfAbsent("Spring", key -> key.length());

        System.out.println(map);

        map.put("A", 10);

        map.compute("A", (k, v) -> v + 5);

        System.out.println(map);

        map.merge("count", 1, Integer::sum);
        map.merge("count", 1, Integer::sum);

        System.out.println(map); // {count=2}

        map.forEach((k,v) ->
                System.out.println(k + " : " + v));
    }
}
