package com.test;

import java.util.Arrays;

public class MaxAndMinValueinArray {

	public static void main(String[] args) {
		
		int ar[]= {12,9,6,14,67,2,5,66};
		
		int max=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<max)
				max=ar[i];
			
		}
		System.out.println(max);
		
		//Arrays.stream(at).max().getAsInt();
		
		int a= 0;
		int b=1;
		int c=0;
		
		for(int i=2;i<10; i++)
		{
			c=a+b;
			System.out.print(c+",");
			
			a=b;
			b=c;
			
		}
	}

}
