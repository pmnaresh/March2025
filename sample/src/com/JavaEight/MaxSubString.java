package com.JavaEight;

import java.util.HashMap;
import java.util.Map;

public class MaxSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String l= "aabcdab";
		int si =getMaxString(l);
		System.out.println(si);

	}
	
	public static int getMaxString(String s)
	{
		int start =0;
		int maxLeng=0;
		int maxStart=0;
		
		Map<Character,Integer> map = new HashMap<>();
		for(int end=0; end <s.length() ; end++ )
		{
			char ch = s.charAt(end);
			
			if(map.containsKey(ch) && map.get(ch) >= start)
			{
				start =map.get(ch)+1;
			}
			map.put(ch, end);
			
			if(end - start +1 >maxLeng)
			{
				maxLeng=end - start +1;
				maxStart =start;
			}
		}
		//return s.substring(maxStart, maxStart+maxLeng);
		return maxLeng;
		
	}

}
