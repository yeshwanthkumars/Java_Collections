package com.yesh.java.collection.comparator;

// Sort the String based on their length using comparator

import java.util.*;

public class ComparatorUsingLambda {

    public static void main(String[] args) {

//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if(o1.length() > o2.length()){
//                    return 1;
//                }
//                else{
//                    return -1;
//                }
//            }
//        };

//        Comparator<String> comparator = ()->{
//            if(o1.length() > o2.length()){
//                return 1;
//            }
//            else{
//                return -1;
//            }
//        };

        Comparator<String> comparator = (o1,o2) -> o1.length()>o2.length() ? 1: -1;

        List<String> name = new ArrayList<>(Arrays.asList("Raj","Yeshwanth","Vishal","Gokul","Kumar","Rama"));

        Collections.sort(name,comparator);

        System.out.println("After Sorting: "+name);
    }
}
