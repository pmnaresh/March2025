package com.leet;

public class StringReverseUsingRecursion {

	public static void main(String[] args) {
		
		String ol=new StringReverseUsingRecursion().getReverse("Naveen");
		System.out.println(ol);
	}
	
	public  String getReverse(String str)
	{
		if(str.isEmpty())
			return str;
		return getReverse(str.substring(1)) +str.charAt(0) ;
		
	}

}
