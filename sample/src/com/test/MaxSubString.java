package com.test;

import java.util.HashMap;
import java.util.Map;

public class MaxSubString {

	public static void main(String[] args) {
		
		String l= "aabcdefghabcdef";
		int si =getMax(l);
		System.out.println(si);
	}
	
	public static int getMax(String str )
	{
		int maxLeg=0;
		int maxStart=0;
		int start=0;
		
		Map<Character, Integer> map =new HashMap<>();
		
		for(int end=0; end<str.length() ; end++)
		{
			
			char ch = str.charAt(end);
			
			if(map.containsKey(ch) && map.get(ch) >= start)
			{
				start=map.get(ch)+1;
				
			}
			map.put(ch, end);
			
			if(end -start > maxLeg)
			{
				maxLeg=end -start +1;
				maxStart=start;
			}
		}
		//return str.substring(maxStart, maxStart+maxLeg);
		return maxLeg;
		
		
	}

}
