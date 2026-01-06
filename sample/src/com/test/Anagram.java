package com.test;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s= "Naveen";
		String s1 ="nvHeea";
		
		boolean status = true;
		
		if(s.length() != s1.length())
		{
			status=false;
		}
		else
		{
			char[] ar = s.toLowerCase().toCharArray();
			char[] ar1= s1.toLowerCase().toCharArray();
			
			Arrays.sort(ar);
			Arrays.sort(ar1);
			
			status=Arrays.equals(ar, ar1);
			
			if(status == true)
				System.out.println("Anagram");
			else
				System.out.println("Not-Anagram");
		}

	}

}
