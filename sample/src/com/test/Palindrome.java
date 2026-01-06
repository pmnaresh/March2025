package com.test;

public class Palindrome {

	public static void main(String[] args) {
		
		int num=161;
		int n=0;
		int s=0;
		int temp=num;
		
		while(num>0)
		{
			n=num%10;
			num= num/10;
			s=s*10+n;
		}
		
		if(s==temp)
		{
			System.out.println("pali");
		}

	}

}
