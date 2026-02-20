package com.yesh.java.collection.set.HashSet;


import java.util.HashSet;
import java.util.Objects;

class Student{

    int id;
    String name;

    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student student = (Student) obj;
        return this.id == student.id;
    }

    public int hashCode(){

        return Objects.hashCode(id);
    }
}

public class CustomObjectHashSet {

    public static void main(String[] args) {

        HashSet<Student> student = new HashSet<>();

        student.add(new Student(2,"Yeshwanth"));
        student.add(new Student(1,"Vishal"));
        student.add(new Student(3,"Gokul"));
        student.add(new Student(2,"Yeshwanth"));

        student.forEach(System.out::println);

        System.out.println("Size of Student Set: "+student.size());

    }
}
