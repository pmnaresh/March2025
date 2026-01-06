package com.JavaEight;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class GetMoreThanTwo {

	public static void main(String[] args) {
		
		
		String s="Naveeen";
		
		
		Map<Character,Integer>  map =new HashMap<>();
		
		
		for(char ch :s.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
			
		}
		
		System.out.println("*********");
		for(  Map.Entry<Character,Integer> es :map.entrySet())
		{
			if(es.getValue()>2)
				System.out.println(es.getKey()+":"+es.getValue());
		}
		
     Map<Character,Long> ma=s.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(ch->ch,Collectors.counting()));

     
     map.entrySet().stream().filter(hl -> hl.getValue()>2).forEach(System.out::println);
     
	}
	
	
}
