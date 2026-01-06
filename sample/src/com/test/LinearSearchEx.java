package com.test;

public class LinearSearchEx {

	public static void main(String[] args) {
		
		
		int [] ar = {12,7,78,15,95,17,3};
		
	int s=	getNumberIndex(ar,3);
		
	System.out.println(s);

	}

	
	public static int getNumberIndex(int arr[] ,int targer)
	{
		
		for(int i=0; i<arr.length ;i++)
		{
			if(arr[i] == targer)
				return i;
		}
		return -1;
		
	}
}
