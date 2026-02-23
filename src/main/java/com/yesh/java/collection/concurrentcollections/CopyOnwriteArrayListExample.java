package com.yesh.java.collection.concurrentcollections;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnwriteArrayListExample {

    public static void main(String[] args) {

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("Java");
        list.addIfAbsent("Java");  //ignored

        System.out.println(list);

        list.remove("Java");

        System.out.println("size: "+list.size());

        for(String s : list){
            list.add("NewValue"); // No Exception
        }

        System.out.println(list);
    }
}
