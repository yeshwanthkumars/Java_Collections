package com.yesh.java.collection.comparator.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee1 {

    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee1(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + age + " | " + salary;
    }
}


public class CustomSortin_Comparator {

    public static void main(String[] args) {

        List<Employee1> empList = new ArrayList<>();

        empList.add(new Employee1(101, "John", 25, 50000));
        empList.add(new Employee1(102, "Alice", 30, 60000));
        empList.add(new Employee1(103, "Bob", 28, 45000));
        empList.add(new Employee1(104, "John", 20, 50000));
        empList.add(new Employee1(105, "Alice", 22, 60000));
        empList.add(new Employee1(106, "David", 35, 70000));
        empList.add(new Employee1(107, "Charlie", 27, 45000));
        empList.add(new Employee1(108, "Eve", 29, 70000));

        System.out.println("Original Employee List:");
        for (Employee1 emp : empList) {
            System.out.println(emp);
        }

        Collections.sort(empList, new Comparator<Employee1>() {

            @Override
            public int compare(Employee1 e1, Employee1 e2) {

                // 1️⃣ Compare Salary (Descending)
                int salaryCompare = Double.compare(e2.getSalary(), e1.getSalary());

                if (salaryCompare != 0) {
                    return salaryCompare;
                }

                // 2️⃣ Compare Name (Ascending)
                int nameCompare = e1.getName().compareTo(e2.getName());

                if (nameCompare != 0) {
                    return nameCompare;
                }

                // 3️⃣ Compare Age (Ascending)
                return Integer.compare(e1.getAge(), e2.getAge());
            }
        });
        System.out.println("Sorted Employee List:");
        for (Employee1 emp : empList) {
            System.out.println(emp);
        }
    }
}
