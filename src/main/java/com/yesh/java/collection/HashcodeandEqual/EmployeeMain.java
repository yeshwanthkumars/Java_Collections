package com.yesh.java.collection.HashcodeandEqual;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("Yeshwanth");

        Employee e2 = new Employee();
        e2.setId(1);
        e2.setName("Yeshwanth");

        System.out.println("Shallow compare: "+(e1==e2));
        System.out.println("Deep compare: "+e1.equals(e2));

        System.out.println("Hashcode: " +(e1.hashcode()==e2.hashcode()));



    }
}
