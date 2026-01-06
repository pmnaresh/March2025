package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employees {

	public static void main(String[] args) {

    Map<String,Integer>  map =new HashMap<>();
    
    map.put("Xee", 89);
    map.put("Joi", 8);
    map.put("Appl", 79);
    map.put("Iol", 13);
    
    
      Set<Entry<String,Integer>>  set=map.entrySet();
      
       set.stream().distinct().sorted(Map.Entry.<String,Integer>comparingByValue()).forEach(System.out::println);

	}

}
