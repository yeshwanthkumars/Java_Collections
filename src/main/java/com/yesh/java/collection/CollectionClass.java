package com.yesh.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionClass {

    public static void main(String[] args) {

        //List
        Collection<String> obj = new ArrayList<>();
        obj.add("Apple");
        obj.add("Banana");

        System.out.println(obj); // [Apple, Banana]


        //Set
        Collection<String> obj1 = new HashSet<>();
        obj1.add("Apple");
        obj1.add("Banana");
        obj1.add("Apple"); // Duplicate, ignored by HashSet

        System.out.println(obj1); // [Banana, Apple]
    }
}
