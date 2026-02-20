package com.yesh.java.collection.HashcodeandEqual;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person{
    String name;

    public String getName() {
        return name;
    }

    public Person(String name){
        this.name = name;
    }

    public boolean equals(Object o){
        if(o==null || getClass() != o.getClass()){
            return false;
        }
        if(o==this){
            return true;
        }

        Person p = (Person) o;
        //return name.equals(p.name);
        //return  p.name == this.name;
        return Objects.equals(p.name, this.name);
    }

    // if add hashcode

    public int hashCode(){
        return Objects.hashCode(name);
    }

}

public class CodeSnippetExample {

    public static void main(String[] args) {
        Person p1 = new Person("Yeshwanth");
        Person p2 = new Person("Yeshwanth");

        Set<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);

        System.out.println("e1 hashcode: "+p1.hashCode());
        System.out.println("e2 hashcode: "+p2.hashCode());
        System.out.println("Size of set: "+set.size());


    }
}
