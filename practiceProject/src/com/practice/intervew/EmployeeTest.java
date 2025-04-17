package com.practice.intervew;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class EmployeeTest {

	public static void main(String[] args) {

		List<Employee> listOFEmployee = new ArrayList<>();

		listOFEmployee.add(new Employee("Naresh", 12345));
		listOFEmployee.add(new Employee("Nishant", 189045));
		listOFEmployee.add(new Employee("Ravi", 1245));
		listOFEmployee.add(new Employee("Ramu", 1045));
		listOFEmployee.add(new Employee("Anji", 54045));
		listOFEmployee.add(new Employee("arvind", 80045));

		listOFEmployee.stream().filter(n -> n.geteSalary() > 50000)
				.sorted((o1, o2) -> o1.geteSalary() > o2.geteSalary() ? -1 : o1.geteSalary() < o2.geteSalary() ? 1 : 0)
				.forEach(System.out::println);

		
	}
}
