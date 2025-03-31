package com.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "Akhila", "Angallu", 30000));
		employeeList.add(new Employee(2, "Naresh", "Angallu", 55000));
		employeeList.add(new Employee(1234, "Naveen", "Madanapalli", 58000));
		employeeList.add(new Employee(45, "Bharath", "Bangalore", 45000));
		employeeList.add(new Employee(98, "Tippu", "Angallu", 56000));

		// sorting by employee salary
		Collections.sort(employeeList, new EmployeeSalaryComparator());
		for (Employee emp : employeeList)
			System.out.println(emp);

		System.out.println("***********");

		// sorting by employee name
		Collections.sort(employeeList, new EmployeeNameComparator());
		for (Employee emp : employeeList)
			System.out.println(emp);
	}

}
