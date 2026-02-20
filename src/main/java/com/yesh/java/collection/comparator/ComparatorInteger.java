package com.yesh.java.collection.comparator;

import java.util.*;

public class ComparatorInteger {

    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 > o2 % 10) {
                    return 1;
                } else return -1;
            }
        };


        List<Integer> num = new ArrayList<>(Arrays.asList(56, 23, 85, 31, 62, 74));

        System.out.println("Number: " + num);

        Collections.sort(num, comparator);

        System.out.println("After Number: " + num);
    }
}
