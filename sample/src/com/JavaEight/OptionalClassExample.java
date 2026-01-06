package com.JavaEight;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) {
		
		
		String name =getNameFromDB();
		
		Optional<String> opt=Optional.ofNullable(name);

	//opt.ifPresent(s -> System.out.println(s.toUpperCase()));
	
	 String upperName=opt.map(String::toUpperCase).orElse("Defalut");
	 System.out.println(upperName);
	}
	 public static String getNameFromDB() {
	        return null; // simulating null return
	    }

}

//Difference between @Component, @Service, and @Repository?
//How do you handle exceptions globally in Spring Boot?
//What is the difference between CascadeType.ALL and CascadeType.MERGE?
//What is an N+1 problem and how do you solve it?
//How do you implement pagination in Spring Boot REST APIs?
//What are REST principles?
//What is Swagger and how do you use it in Spring Boot?


