package com.JavaEight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupOfAnagrams {

	public static void main(String[] args) {
		
		String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> grouped = groupAnagrams(input);

        for (List<String> group : grouped) {
            System.out.println(group);
        }
	}
	 public static List<List<String>> groupAnagrams(String[] strs) {
	        if (strs == null || strs.length == 0) 
	        	return new ArrayList<>();

	        Map<String, List<String>> map = new HashMap<>();

	        for (String str : strs) {
	            char[] chars = str.toCharArray();
	            Arrays.sort(chars);  // Sort the characters
	            String key = new String(chars);  // Use sorted string as key

	            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
	        }

	        return new ArrayList<>(map.values());
	    }

}
