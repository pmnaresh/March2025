package com.test;

public class FindMissingNumber {

	
	public static void main(String[] args) {
		
		int [] aw= {12,23,45,34,};
	int d=	findMissingNumber(aw,6);
	System.out.println(d);
	}
	
	private static int findMissingNumber(int[] arr, int n)
	{
		int total = n* (n+1)/2;
		int sum=0;
		
		for(int num:arr)
		{
			sum+=num;
		}
		return total-sum;
	}
}
