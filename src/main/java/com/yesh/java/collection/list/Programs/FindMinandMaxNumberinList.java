package com.yesh.java.collection.list.Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMinandMaxNumberinList {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(23,42,12,1,2,4,5,3,10,100,50,92));


        System.out.println("Minimum number: "+ Collections.min(numbers));
        System.out.println("Maximum number: "+ Collections.max(numbers));
    }
}
