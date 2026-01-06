package com.test;

import java.util.HashMap;
import java.util.Map;

public class StringLts {

	public static void main(String[] args) {
		
		
		String s = "adbbaaicabcbc";
		
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(char ch : s.toCharArray())
		{
			
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}

		System.out.println(map);
		
		StringBuffer sb = new StringBuffer();
		
		for(Map.Entry<Character,Integer> ed : map.entrySet())
		{
			
		        sb.append(ed.getKey()).append(ed.getValue());
		}
		System.out.println(sb);
	}
	
	

}
