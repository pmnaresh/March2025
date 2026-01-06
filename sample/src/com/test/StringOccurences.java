package com.test;

public class StringOccurences {

	public static void main(String[] args) {
		
		String str = "I love india love in ";
		
		int count =0;
		String s ="love";
		
		
		String [] s1 = str.split(" ");
		
		for(String d :s1)
		{
			if(d.equalsIgnoreCase(s))
				count ++;
		}
		System.out.println(count);

	}

}
