package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Sample {

	public static void main(String[] args) {
		
// using java 8 features 
	List<Integer> list = new ArrayList<>();
	list.add(12);
	list.add(3);
	list.add(89);
	list.add(4);
	list.add(62);
	list.add(91);
	
//	list.stream().filter(n-> n%2 ==0) .forEach(System.out::println);//even nums
//	
//	Optional<Integer> secondHighest=list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();//second higest 
//	
//	System.out.println(secondHighest);
	
	/*
	 * List<Employee> employees = Arrays.asList( new Employee(1, "Alice", 50000),
	 * new Employee(2, "Bob", 70000), new Employee(3, "Charlie", 60000), new
	 * Employee(4, "David", 70000), new Employee(5, "Eve", 45000) );
	 * 
	 * 
	 * Optional<String>hi=employees.stream().distinct().sorted(Comparator.
	 * comparingDouble(Employee::getSalary).reversed()).map(Employee::getName).skip(
	 * 1).findFirst();
	 * 
	 * System.out.println(hi);
	 */
	
	
	String s= "madaam";
	
	boolean sd=IntStream.range(0, s.length()/2).allMatch(i->s.charAt(i)== s.charAt(s.length()-1-i));
	System.out.println(sd);
	
	int num =1768;
	int count=0;
	int n=0;
	while (num>0)
	{
		n=num%10;
		num=num/10;
		count++;
	}
	System.out.println(count);
	
	}
	
	
}
