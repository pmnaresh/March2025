package com.JavaEight;

public class StringReverse {

	public static void main(String[] args) {
		
		
		
		String input = "Naveen";
        String reversed = reverse(input);
        System.out.println("Reversed: " + reversed);
	}

	
	public static String reverse( String str)
	{
		if (str == null || str.length() <= 1) {
            return str;
        }
        
        return reverse(str.substring(1)) + str.charAt(0);
		
	}
}
