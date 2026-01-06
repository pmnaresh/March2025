package com.leet;

import java.util.ArrayList;
import java.util.List;

public class MostOccurences {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 0, 0, 1, 2, 2, 2, 2, 2, 2, 2, 7, 9, 10, 2 };

		

		int currentCount=1;
		int maxCount=0;
		int num=0;
		for(int i=1; i<arr.length ;i++)
		{
			
			if(arr[i-1] == arr[i])
			{
				currentCount++;
				maxCount=Math.max(maxCount, currentCount);
				 num =arr[i];
			}
			else
			{
				currentCount=0;
			}
		}
		
		
		

		System.out.println( num + ":" +maxCount);

	}

}
