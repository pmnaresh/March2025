package com.test;

import java.util.Objects;

public class EqualsAndDoubleEqualsOper {

	String name;

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsAndDoubleEqualsOper other = (EqualsAndDoubleEqualsOper) obj;
		return Objects.equals(name, other.name);
	}
	  
	 
	public static void main(String[] args) {

		String s = new String("naveen");
		String s1 = new String("naveen");
		String s2 = "naveen";
		String s3 = "naveen";

		System.out.println(s.equals(s1));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s2.equals(s3));// true
		System.out.println(s3.equals(s1));// true

		System.out.println(s == s1);// false
		System.out.println(s1 == s3);// false
		System.out.println(s2 == s3);// true

		int i = 8;
		int j = 8;

		System.out.println(i == j);

		// System.out.println(i.equals(j));

	}

}
