package com.practice.logical;

import java.util.HashSet;

class Student {
    public int id;
    public String name;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int hashCode() {
        return this.id;
    }

    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student s = (Student) o;
            return s.id == this.id;
        }
        return false;
    }

    public String toString() {
        return "Student: " + this.name + "@" + Integer.toHexString(hashCode());
    }
}

public class UpdateHashSet {
    public static void main(String[] args) {
        HashSet<Student> studentList = new HashSet<>();

        Student st1 = new Student("Nimit", 1);
        Student st2 = new Student("Rahul", 3);
        Student st3 = new Student("Nimit", 2);

        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);

        System.out.println("Size before mutation: " + studentList.size());  // Output: 3

        // Mutating the hashCode field after insertion
        st1.id = 3;

        System.out.println("Size after mutation: " + studentList.size());   // Output: 3

        // Trying to remove mutated object
        boolean removed = studentList.remove(st1); // This will likely fail
        System.out.println("Was mutated object removed? " + removed);      // Output: false

        // Checking contents
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}

