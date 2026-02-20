package com.yesh.java.collection.map.Programs;

import java.util.HashMap;

public class CharacterFrequency {

    public static void main(String[] args) {

        String str = "java";

        HashMap<Character,Integer> wordcount = new HashMap<>();

        for(Character ch : str.toCharArray()){

            wordcount.put(ch, wordcount.getOrDefault(ch,0)+1);
        }

        System.out.println("Word Count: "+wordcount);
    }
}
