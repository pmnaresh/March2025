package com.test;

public class FindSinglePrimeornot {

	public static void main(String[] args) {
		
		
		int num =8 ;
		
		int temp=0;
		for(int i=1; i<=num/2 ;i++)
		{
			if(num%i==0)
				temp++;
		}
		if(temp==1)
			System.out.println(num+"Is prime");
		else
			System.out.println(num+"not a prime");


	}

}
