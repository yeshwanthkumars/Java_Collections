package com.yesh.java.collection.map.Programs;

import java.util.*;

public class SortMapByValue {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 30);
        map.put("B", 10);
        map.put("C", 20);

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());

        System.out.println("List->"+list);

        list.sort(Map.Entry.comparingByValue());

        for(Map.Entry<String,Integer> entry : list){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
