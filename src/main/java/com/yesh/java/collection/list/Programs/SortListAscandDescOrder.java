package com.yesh.java.collection.list.Programs;

import java.util.*;

public class SortListAscandDescOrder {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(23,42,12,1,2,4,5,3,10,100,50,92));


        Collections.sort(numbers);

        System.out.println("Ascending Order: "+numbers);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        System.out.println("Descending Order: "+numbers);


    }
}
