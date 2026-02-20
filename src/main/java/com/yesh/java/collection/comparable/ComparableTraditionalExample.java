package com.yesh.java.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
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

    @Override
    public int compareTo(Student o) {
        return this.age > o.age ? 1:-1;
    }
}

public class ComparableTraditionalExample {

    public static void main(String[] args) {

        List<Student> student = new ArrayList<>();
        student.add(new Student(26, "Yeshwanth"));
        student.add(new Student(25, "Gokul"));
        student.add(new Student(27, "Vishal"));
        student.add(new Student(22, "Raj"));

        Collections.sort(student);

        for(Student s : student){
            System.out.println(s);
        }
    }
}
