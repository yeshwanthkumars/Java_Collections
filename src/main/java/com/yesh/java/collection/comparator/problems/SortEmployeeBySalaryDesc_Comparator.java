package com.yesh.java.collection.comparator.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Sort Employees by Salary (Descending) Using Comparator

class Employee{

    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}



public class SortEmployeeBySalaryDesc_Comparator {

    public static void main(String[] args) {



        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(2,"Yeshwanth",100000));
        emp.add(new Employee(3,"Vishal",200000));
        emp.add(new Employee(1,"Gokul",300000));

        Collections.sort(emp, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o2.salary,o1.salary);
            }
        });

        emp.forEach(System.out::println);

    }
}