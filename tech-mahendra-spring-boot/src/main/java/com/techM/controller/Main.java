package com.techM.controller;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		String sdf="abbccccca";
		//output a2b2c4a2
		
//		HashMap<Character, Integer> map = new HashMap<>();	
//		for(char ch : sdf.toCharArray())
//		{
//			map.put(ch, map.getOrDefault(ch, 0) +1);
//		}
//		StringBuilder sb = new StringBuilder();
//		for(Map.Entry<Character, Integer>)
		
		StringBuilder sb = new StringBuilder();
		int count =1;
		
		for(int i=1; i<sdf.length() ; i++)
		{
			if(sdf.charAt(i ) == sdf.charAt(i-1))
			{
				count++;
			}
			else
			{
				if(count==1) {
					sb.append(sdf.charAt((i-1)));
				}else {
					sb.append(sdf.charAt((i-1))).append(count);
					count=1;
				}
				
			}
						
		}
		sb.append(sdf.charAt(sdf.length() -1)).append(count);
		System.out.println(sb);
		
		
		
		

	}

}
