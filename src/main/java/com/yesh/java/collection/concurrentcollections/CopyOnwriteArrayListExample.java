package com.yesh.java.collection.concurrentcollections;

import java.util.ArrayList;
import java.util.Arrays;
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

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("A");
        l1.add("B");

        CopyOnWriteArrayList<String> l2 = new CopyOnWriteArrayList<>();
        l2.addIfAbsent("A");
        l2.addIfAbsent("B");
        l2.addAll(l1);

        System.out.println("Final list "+l2);

        ArrayList<String> l3 = new ArrayList<>();
        l3.add("A");
        l3.add("E");

        l2.addAllAbsent(l3);

        System.out.println(l2);


    }
}
