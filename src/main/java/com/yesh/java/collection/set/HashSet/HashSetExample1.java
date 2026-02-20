package com.yesh.java.collection.set.HashSet;

import java.util.HashSet;

public class HashSetExample1 {

    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);

        System.out.println("HashSet: "+numbers);

        System.out.println("HashSet Size: "+numbers.size());

    }
}
