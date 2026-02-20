package com.yesh.java.collection.list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> animals = new LinkedList<>();

        // Add elements
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Elephant");

        // Print the LinkedList
        System.out.println("Animals: " + animals); // [Cat, Dog, Elephant]

        // Add an element at the beginning
        animals.addFirst("Rabbit");
        System.out.println("After adding Rabbit: " + animals); // [Rabbit, Cat, Dog, 7Elephant]

        // Add an element at the end
        animals.addLast("Horse");
        System.out.println("After adding Horse: " + animals); // [Rabbit, Cat, Dog, Elephant, Horse]

        // Get elements
        System.out.println("First Animal: " + animals.getFirst()); // Rabbit
        System.out.println("Last Animal: " + animals.getLast()); // Horse

        // Remove elements
        animals.removeFirst();
        System.out.println("After removing first: " + animals); // [Cat, Dog, Elephant, Horse]
        animals.removeLast();
        System.out.println("After removing last: " + animals); // [Cat, Dog, Elephant]

        // Replace an element
        animals.set(1, "Wolf");
        System.out.println("After replacing Dog with Wolf: " + animals); // [Cat, Wolf, Elephant]

        // Check if the list contains an element
        System.out.println("Contains 'Cat'? " + animals.contains("Cat")); // true

        // Check size
        System.out.println("Size of the list: " + animals.size()); // 3

        // Clear the list
        animals.clear();
        System.out.println("Is the list empty? " + animals.isEmpty()); // true
    }
}
