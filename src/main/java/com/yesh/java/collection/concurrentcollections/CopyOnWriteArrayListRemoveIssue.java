package com.yesh.java.collection.concurrentcollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRemoveIssue {

    public static void main(String[] args) {

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        System.out.println("List Before: "+list);

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            String s1 = (String)itr.next();
            if(s1.equals("F")){
                itr.remove();
            }
        }
        System.out.println("After Before: "+list);

    }
}
