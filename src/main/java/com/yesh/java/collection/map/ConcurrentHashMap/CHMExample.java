package com.yesh.java.collection.map.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class CHMExample {
    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("A", 100);
        map.putIfAbsent("B", 200);
        map.computeIfAbsent("C", k -> 300);

        map.forEach((k, v) ->
                System.out.println(k + " -> " + v));
    }
}
