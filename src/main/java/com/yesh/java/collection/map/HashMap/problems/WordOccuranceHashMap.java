package com.yesh.java.collection.map.HashMap.problems;

import java.util.HashMap;

public class WordOccuranceHashMap {

    public static void main(String[] args) {

        String text = "Java is fun and Java is powerful";

        HashMap<String, Integer> wordcount = new HashMap<>();

        for(String word : text.split(" ")){

            wordcount.put(word, wordcount.getOrDefault(word,0)+1);

        }
        System.out.println("Word count: "+wordcount);
    }
}
