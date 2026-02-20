package com.yesh.java.collection.set.Programs;

import java.util.*;

public class FindDuplicatesinSet {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,2,4,1,5);

        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for(Integer num : list){
            if(!unique.add(num)){
                duplicates.add(num);
            }
        }

        System.out.println("Duplicates: " + duplicates);

    }
}
