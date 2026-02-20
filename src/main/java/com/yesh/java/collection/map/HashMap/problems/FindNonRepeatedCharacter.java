package com.yesh.java.collection.map.HashMap.problems;

import java.util.HashMap;

public class FindNonRepeatedCharacter {

    public static void main(String[] args) {

        String name="swiss";

        HashMap<Character,Integer> charcter = new HashMap<>();

        for(char c : name.toCharArray()){

            charcter.put(c,charcter.getOrDefault(c,0)+1);

        }

        System.out.println("Character Count: "+charcter);

        for(char c : name.toCharArray()){

            if(charcter.get(c)==1){
                System.out.println("First non-repeating character: " + c);
                break;
            }
        }

    }
}
