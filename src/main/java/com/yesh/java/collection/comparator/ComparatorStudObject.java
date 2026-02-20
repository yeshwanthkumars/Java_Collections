package com.yesh.java.collection.comparator;

// Sort the Student Objects based on their ages using comparator

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;

    public Student(int age,String name){
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ComparatorStudObject {

    public static void main(String[] args) {

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.age > o2.age){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        List<Student> student = new ArrayList<>();
        student.add(new Student(26, "Yeshwanth"));
        student.add(new Student(25, "Gokul"));
        student.add(new Student(27, "Vishal"));
        student.add(new Student(22, "Raj"));

        Collections.sort(student,comparator);

        for(Student s : student){
            System.out.println(s);
        }
    }
}
