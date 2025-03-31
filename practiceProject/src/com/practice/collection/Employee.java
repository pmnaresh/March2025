package com.practice.collection;

public class Employee {

	private int eId;
	private String eName;
	private String eLocation;
	private double eSalary;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteLocation() {
		return eLocation;
	}

	public void seteLocation(String eLocation) {
		this.eLocation = eLocation;
	}

	public double geteSalary() {
		return eSalary;
	}

	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}

	public Employee(int eId, String eName, String eLocation, double eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eLocation = eLocation;
		this.eSalary = eSalary;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eLocation=" + eLocation + ", eSalary=" + eSalary + "]";
	}

	public Employee() {
		super();
	}

}
