package com.yesh.java.collection.failfast_failsafe;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;

public class FailSafeExample {

    public static void main(String[] args) {

        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("Kafka");

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            String name = itr.next();
            System.out.println(name);
            if(name.equals("Spring")) {
                list.add("MySQL");
            }
        }
        System.out.println(list);
    }
}
