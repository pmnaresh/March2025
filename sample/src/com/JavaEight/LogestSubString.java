package com.JavaEight;

import java.util.HashMap;
import java.util.Map;

public class LogestSubString {

	public static void main(String[] args) {
		String	s = "abcdabcbbabcdeabf";
		
		
		
		System.out.println(getSubString(s));
	}

	
	public static int getSubString(String s)
	{
		 int start=0;
		 int MaxLeng=0;
		 int MaxStart=0;
		 
		 Map<Character,Integer> map = new HashMap<>();
		 
		 
		 for(int end=0; end<s.length() ; end++)
		 {
			 char ch = s.charAt(end);
			 if(map.containsKey(ch)  && map.get(ch)  >= start)
			 {
				 start=map.get(ch) +1;
				 
			 }
			 map.put(ch, end);
			 
			 if(end-start +1   > MaxLeng)
			 {
				 MaxLeng=end-start +1 ;
				 MaxStart = start;
			 }
		 }
		// return s.substring(MaxStart,MaxLeng+MaxStart);
		 System.out.println(s.substring(MaxStart,MaxLeng+MaxStart));
		 return MaxLeng;
	}
}
