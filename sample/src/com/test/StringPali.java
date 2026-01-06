package com.test;

import java.util.stream.IntStream;

public class StringPali {

	public static void main(String[] args) {
		 String input = "madam";

//	        boolean isPalindrome = IntStream.range(0, input.length() / 2)
//	            .allMatch(i -> input.charAt(i) == input.charAt(input.length() - 1 - i));
		 
		 boolean isPalindrome =IntStream.range(0, input.length()/2).allMatch(i->input.charAt(i) == input.charAt(input.length()-1-i));

	        System.out.println("Is Palindrome? " + isPalindrome);
	     
	        
	     
	        

	}

}
