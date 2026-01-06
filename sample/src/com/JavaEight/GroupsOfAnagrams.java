package com.JavaEight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupsOfAnagrams {

	public static void main(String[] args) {
		String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
		 List<List<String>> grouped = getAnagrams(input);

	        for (List<String> group : grouped) {
	            System.out.println(group);
	        }

	}

	public static  List<List<String>> getAnagrams (String [] str)
	{
		
		if(str ==null || str.length==0)
		{
			new ArrayList<>();	
		}
		
		Map<String,List<String>> m = new HashMap<>();
		
		
		for(String  s :str)
		{
			char[]ch = s.toCharArray();
			Arrays.sort(ch);
			
			String l = new String (ch);
			m.computeIfAbsent(l,li->new ArrayList<>()).add(s);
		}
		return new ArrayList<>(m.values());
	}
}
