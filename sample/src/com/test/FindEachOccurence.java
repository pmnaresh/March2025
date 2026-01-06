package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindEachOccurence {

	public static void main(String[] args) {
		
		String name ="NaveenKumar";
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char c : name.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		
		/*
		 * for(Map.Entry<Character, Integer> es :map.entrySet()) {
		 * System.out.println(es.getKey()+":"+es.getValue()); }
		 */
	//	System.out.println(map.g);
		
		
		for(Map.Entry<Character, Integer> os: map.entrySet())
		{
			if(os.getValue()>2)
				System.out.println(os.getKey()+" :"+os.getKey());
		}
		
		//Set<Character> mp=map.keySet();
		
	}

}
