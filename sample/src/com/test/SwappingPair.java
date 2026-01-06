package com.test;

public class SwappingPair {

	public static void main(String[] args) {
		
		String sttr ="abcde";
		
		
		for(int j=sttr.length()-1; j>0 ;j--)
		{
			System.out.println(sttr.charAt(j));
		}
		char [] ar= sttr.toCharArray();
		
		
		for(int i=0; i<ar.length-1;i+=2)
		{
			char temp= ar[i];
			ar[i]=ar[i+1];
			ar[i+1]=temp;
		}
		
		for(char c: ar)
		{
			System.out.print(c);
		}
		
		

	}

}
