package com.yesh.java.collection.map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

    public static void main(String[] args) {


        HashMap<String, String> map = new HashMap<>();

        map.put("Name","Yeshwanth Kumar");
        map.put("Age","26");
        map.put("Department","IT");
        map.put("Gender","Male");

        System.out.println("HashMap: "+map);

        System.out.println("Name: "+map.get("Name"));
        System.out.println("Size: "+map.size());
        System.out.println("Is Empty: "+map.isEmpty());
        System.out.println("KeySet: "+map.keySet());
        System.out.println("Values: "+map.values());
        System.out.println("Contains Key: "+map.containsKey("Name"));
        System.out.println("Contain Value: "+map.containsValue("IT"));
        System.out.println("Entry Set: "+map.entrySet());
        System.out.println("Remove: "+map.remove("Age"));

        System.out.println("Final HashMap: "+map);

        System.out.println("Key Set Iteration");
        for(String key : map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }

        System.out.println("Entry Set Iteration");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Java 8 Iteration");
        map.forEach((key,value)->System.out.println(key + ": " + value));


    }
}
