package com.practice.intervew;

import java.util.HashMap;
import java.util.Map;

public class CountOFEachLetter {

	public static void main(String[] args) {
		
		String str = "Hello World";
		char[] charArr = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		for (char ch : charArr) {
			if (ch != ' ') {
				hm.put(ch, hm.getOrDefault(ch, 0) + 1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}

	}

}
