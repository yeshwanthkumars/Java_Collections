package com.yesh.java.collection.list.Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{

    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public String toString(){
        return "Employee={"+id+ ", "+name+", "+salary+"}";
    }

}

public class SortEmployee {

    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();

        emp.add(new Employee(1,"Yeshwanth",10000));
        emp.add(new Employee(2,"Gokul",30000));
        emp.add(new Employee(3,"Vishal",20000));

        Collections.sort(emp, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o1.salary,o2.salary);
            }
        });

        emp.forEach(System.out::println);

    }
}
