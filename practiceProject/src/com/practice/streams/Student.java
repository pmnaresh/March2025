package com.practice.streams;

public class Student implements Comparable<Student> {

	private int sNo;
	private String sName;
	private String sAddress;
	private long sContact;

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public long getsContact() {
		return sContact;
	}

	public void setsContact(long sContact) {
		this.sContact = sContact;
	}

	@Override
	public String toString() {
		return "Student [sNo=" + sNo + ", sName=" + sName + ", sAddress=" + sAddress + ", sContact=" + sContact + "]";
	}

	public Student(int sNo, String sName, String sAddress, long sContact) {
		this.sNo = sNo;
		this.sName = sName;
		this.sAddress = sAddress;
		this.sContact = sContact;
	}

	public Student() {
	}

	@Override
	public int compareTo(Student o) {	
		return this.getsName().compareToIgnoreCase(o.getsName());
	}

//	@Override
//	public int compareTo(Student o) {
//		if (this.sNo > o.sNo)
//			return 1;
//		else if (this.sNo < o.sNo)
//			return -1;
//		return 0;
//	}

}
