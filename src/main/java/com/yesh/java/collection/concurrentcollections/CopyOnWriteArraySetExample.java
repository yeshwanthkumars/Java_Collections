package com.yesh.java.collection.concurrentcollections;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetExample {

    public static void main(String[] args) {

        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("A");

        System.out.println(set);

    }
}
