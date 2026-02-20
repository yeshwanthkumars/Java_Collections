package com.yesh.java.collection.comparable;

import java.util.*;

class Name implements Comparable<Name> {

    private String value;

    public Name(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public int compareTo(Name other) {

        // Sort by length
        //return Integer.compare(this.value.length(), other.value.length());
        return this.value.length() - other.value.length();
    }

    @Override
    public String toString() {
        return value;
    }
}


public class ComparableString {

    public static void main(String[] args) {


        List<Name> names = new ArrayList<>();

        names.add(new Name("Raj"));
        names.add(new Name("Yeshwanth"));
        names.add(new Name("Vishal"));
        names.add(new Name("Gokul"));
        names.add(new Name("Kumar"));
        names.add(new Name("Rama"));

        Collections.sort(names);

        System.out.println(names);


    }
}
