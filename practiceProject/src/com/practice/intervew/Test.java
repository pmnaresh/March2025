package com.practice.intervew;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
	
	
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(12,13,14,16,17,12,13);
		//12,13
		list.stream().distinct().collect(Collectors.toList());
		
		Set<Integer> set = new HashSet<>();
		List<Integer> dupList=	list.stream().filter(n -> !set.add(n)).collect(Collectors.toList());
		System.out.println(dupList);
		
		
		String s= getName();
	 Optional<String>lo= Optional.ofNullable(s);
	 
	 lo.ifPresent(h -> System.out.println(h.toUpperCase()));
	 
	 lo.orElse("Default" );
	 
	 
	Optional<String> op= Optional.ofNullable(null);
	
	String lp=op.map(String::toUpperCase).orElse("Default");
	
	System.out.println(lp);
	  
		
	}

	
	public static String getName( )
	{
		return null;
	}

}
