package com.practice.intervew;

public class Employee {

	
	
	private String eName;
	private double eSalary;
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	public Employee(String eName, double eSalary) {
		super();
		this.eName = eName;
		this.eSalary = eSalary;
	}
	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eSalary=" + eSalary + "]";
	}
	
	
}
