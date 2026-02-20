package com.yesh.java.collection.list.Programs;

import java.util.*;

public class RemoveDuplicatesList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 10, 30, 20, 40));

        Set<Integer> set = new LinkedHashSet<>(list);

        List<Integer> finallist = new ArrayList<>(set);

        System.out.println("Final List: "+finallist);

    }
}
