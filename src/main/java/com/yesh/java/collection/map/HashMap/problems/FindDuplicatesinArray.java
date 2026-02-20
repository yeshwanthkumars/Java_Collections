package com.yesh.java.collection.map.HashMap.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDuplicatesinArray {

    public static void main(String[] args) {

        List<Integer> duplicatenumbers = new ArrayList<>();
        HashMap<Integer,Integer> numbermaps = new HashMap<>();

        int[] nums = {1, 2, 3, 1, 2, 4};

        for(int num: nums ){
            numbermaps.put(num,numbermaps.getOrDefault(num,0)+1);
        }

        System.out.println("Number Maps: "+numbermaps);

        for(int key: numbermaps.keySet()){
            if(numbermaps.get(key) >1){
                duplicatenumbers.add(key);
            }
        }

        System.out.println("Duplicate Numbers: "+duplicatenumbers);
    }
}
