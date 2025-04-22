package com.practice.wissen;

import java.util.HashSet;

class Student {
    public int id;
    public String name;

    // Constructor to initialize the name and id
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Overridden hashCode method based on id
    public int hashCode() {
        return this.id;
    }

    // Overridden toString method for printing the student details
    public String toString() {
        return "Student: " + this.name + "@" + Integer.toHexString(hashCode());
    }

    // Overridden equals method to compare based on id
    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student s = (Student) o;
            return s.id == this.id;
        }
        return false;
    }
}

public class UpdateHashSet {
    public static void main(String[] args) {
        // Create a HashSet to store Student objects
        HashSet<Student> studentList = new HashSet<>();
        
        // Creating Student objects
        Student st1 = new Student("Nimit", 1);
        Student st2 = new Student("Rahul", 3);
        Student st3 = new Student("Nimit", 2);
        
        // Adding students to the HashSet
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        
        // Printing size of the HashSet
        System.out.println(studentList.size()); // Expected Output: 3
        
        // Changing id of st1 to 3
        st1.id = 3;
        
        // Printing size of the HashSet after modifying st1's id
        System.out.println(studentList.size()); // Expected Output: 2
    }
}

