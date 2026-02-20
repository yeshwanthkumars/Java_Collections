package com.yesh.java.collection.comparable.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Sort Employees by ID (Using Comparable)

class Employee implements Comparable<Employee>{
    int id;
    String name;

    public Employee(int id, String name){
        this.id = id;
        this.name =name;
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class SortEmployeeById_Comparable {

    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(2,"Yeshwanth"));
        emp.add(new Employee(1,"Vishal"));
        emp.add(new Employee(3,"Gokul"));

        Collections.sort(emp);

        for(Employee e : emp){
            System.out.println("Employees: "+e);
        }
    }
}
