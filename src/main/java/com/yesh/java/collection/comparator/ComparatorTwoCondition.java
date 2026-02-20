package com.yesh.java.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}

public class ComparatorTwoCondition {

    public static void main(String[] args) {

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                int nameCompare = p1.getName().compareTo(p2.getName());

                if (nameCompare != 0) {
                    return nameCompare;
                }

                //return Integer.compare(p1.getAge(), p2.getAge());
                return p1.getAge() - p2.getAge();

            }
        };

        List<Person> list = new ArrayList<>();

        list.add(new Person("John", 25));
        list.add(new Person("Alice", 30));
        list.add(new Person("John", 20));
        list.add(new Person("Bob", 28));
        list.add(new Person("Alice", 22));

        Collections.sort(list,comparator);

        for(Person p: list){
            System.out.println(p);
        }



    }
}
