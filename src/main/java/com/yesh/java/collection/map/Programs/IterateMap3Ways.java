package com.yesh.java.collection.map.Programs;

import java.util.HashMap;
import java.util.Map;

public class IterateMap3Ways {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");

        // 1. keySet
        System.out.println("--KeySet--");
        for (Integer key: map.keySet()){
            System.out.println(key+ " : "+map.get(key));
        }

        //2. Entry set
        System.out.println("--Entry set--");
        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        //3.for each
        System.out.println("--For Each--");
        map.forEach((key,value) -> System.out.println(key+ " : "+value));


    }
}
