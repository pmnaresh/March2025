package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServiceApplication.class, args);
		System.out.println("Hi");
	}

}
