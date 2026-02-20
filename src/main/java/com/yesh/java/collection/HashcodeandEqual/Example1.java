package com.yesh.java.collection.HashcodeandEqual;

class Student{

    String name;
    String department;

    public String toString(){
        return "Student= { " +name+" : "+department+ " }";
    }

    public boolean equals(Student that){
        if(this.name.equals(that.name) && this.department.equals(that.department)){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Example1 {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name="Yeshwanth";
        student1.department="IT";

        Student student2 = new Student();
        student2.name="Yeshwanth";
        student2.department="IT";

        System.out.println("Student1: "+student1);
        System.out.println("Student2: "+student2);

        System.out.println("Equals Method: "+student1.equals(student2));
        System.out.println("Hashcode Method: "+(student1.hashCode() == student2.hashCode()));

    }
}
