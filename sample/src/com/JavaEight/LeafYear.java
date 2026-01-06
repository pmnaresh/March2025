package com.JavaEight;

import java.util.HashMap;
import java.util.Map;

public class LeafYear {

	public static void main(String[] args) {
		
	
	 
	for( int i=2000 ;i<=2025 ;i++)
	{
		if(i%4==0  && i%100 !=0 || i%400==0)
		{
			System.out.println(i+" :leafYear");
		}
	}
	
	String s="six ";
	

	
//	 
//	
//	int o=Integer.parseInt(s);
//	
//	System.out.println(o);
	
	Map<String,Integer>  map =new HashMap<>();
	
	map.put("one", 1);
	map.put("Two", 2);
	map.put("Three", 3);
	map.put("four", 4);
	map.put("five", 5);
	map.put("six", 6);
	map.put("seven", 7);
	
	if (map.containsKey(s.toLowerCase().trim())) {
	    int r = map.get(s.toLowerCase().trim());
	    System.out.println(r);  // Output: 10
	} else {
	    System.out.println("Invalid input string");
	}
	
	
	

	 
	
	}

}
