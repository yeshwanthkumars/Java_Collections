package com.yesh.java.collection.concurrentcollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListUpdate {

    public static void main(String[] args) {

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("List Before: "+list);

        Iterator<String> itr = list.iterator();
        list.add("D");
        while(itr.hasNext()){
            String s1 = (String)itr.next();
            System.out.println(s1);
        }
    }
}
