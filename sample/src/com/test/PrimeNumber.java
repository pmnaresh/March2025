package com.test;

public class PrimeNumber {

	
	public static void main(String[] args) {
		
		int temp=0;
		
		for(int i=1;i<=20;i++)
		{
			for(int j=1; j<=20;j++) {
				if(i%j==0)
				{
					temp++;
				}
			}
			if(temp<=2)
			{
				System.out.println(i+",");
			}
			temp=0;
		}
		
		int fact=1;
		
		for(int i=1; i<= 3; i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
		int h =24;
		
		for(int i=1; i<=24/2 ;i++)
		{
			if(h%i ==0)
			{
				System.out.print(i+",");
			}
		}
	}
}
