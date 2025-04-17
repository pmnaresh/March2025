package com.practice.collection;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.geteSalary() > o2.geteSalary()?1:o1.geteSalary() < o2.geteSalary()?-1:0;
//		if (o1.geteSalary() > o2.geteSalary())
//			return 1;
//		else if (o1.geteSalary() < o2.geteSalary())
//			return -1;
//		return 0;
	}

}
