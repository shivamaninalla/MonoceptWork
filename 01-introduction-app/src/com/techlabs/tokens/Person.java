package com.techlabs.tokens;

import java.util.ArrayList;
import java.util.List;

class Person implements Cloneable {
    private String name;
    private int age;
    private List<String> pets;

    public Person(String name, int age, List<String> pets) {
        this.name = name;
        this.age = age;
        this.pets = pets;
    }

    // Shallow copy method using clone()
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> pets = new ArrayList<>();
        pets.add("dog");
        pets.add("cat");

        Person original = new Person("John", 30, pets);

        // Creating a shallow copy
        Person shallowCopy = (Person) original.clone();
        
        System.out.println(shallowCopy.hashCode());
        System.out.println(original.hashCode());

        // Modifying original object
       shallowCopy.getPets().add("fish");

        // Checking shallow copy
        System.out.println("Shallow Copy Example:");
        System.out.println("Original: " + original);
        System.out.println("Shallow Copy: " + shallowCopy);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pets=" + pets +
                '}';
    }

    public List<String> getPets() {
        return pets;
    }
}
