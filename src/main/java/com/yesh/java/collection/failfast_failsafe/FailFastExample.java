package com.yesh.java.collection.failfast_failsafe;

import java.util.*;

public class FailFastExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("Kafka");


        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            String name = itr.next();
            System.out.println(name);
            list.remove(name);
        }
        System.out.println(list);
    }
}