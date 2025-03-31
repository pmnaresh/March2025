package com.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparableMain {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1234, "Naresh", "Angallu", 7878788));
		studentList.add(new Student(12, "Suresh", "Angallu", 7878788));
		studentList.add(new Student(2, "Madhu", "Angallu", 7878788));
		studentList.add(new Student(213, "Rani", "Angallu", 7878788));
		studentList.add(new Student(876, "Raju", "Angallu", 7878788));
		studentList.add(new Student(9876, "Mantri", "Angallu", 7878788));
		studentList.add(new Student(143, "thief", "Angallu", 7878788));
		studentList.add(new Student(1, "king", "Angallu", 7878788));

		
		//assending order
		Collections.sort(studentList);

		for (Student std : studentList) {
			System.out.println(std);
		}
	}

}
