package com.test;

import java.util.Arrays;
import java.util.Optional;

public class ArraySort {

	
	public static void main(String[] args) {
		
		
		int []arr1 = {1,5,3,6};
		int []arr2 = {8,2,23,4};
		
		int [] arr3 = new int[arr1.length+arr2.length];
		int k=0;
		for(int i=0; i<arr1.length;i++)
		{
			arr3[k] = arr1[i];
			k++;
		}
		for(int j=0; j<arr2.length;j++)
		{
			arr3[k] = arr2[j];
			k++;
		}
		
		int temp = 0;
		for (int i = 0; i < arr3.length; i++) {
			for (int j = i+1 ; j < arr3.length; j++) {
				if (arr3[i] < arr3[j]) {
					temp = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = temp;
				}
			}
		}
		 
		
		for(int i=0; i<arr3.length ;i++)
		{
			System.out.println(arr3[i]);
		}
		
		/*
		 * Optional<Integer> li = Arrays.stream(arr3).boxed().distinct().sorted((a,b)
		 * ->b-a)
		 * 
		 * .skip(2) .findFirst();
		 * 
		 * //li.ifPresent(System.out::println); // Output: 6 (if 23, 8 are 1st and 2nd)
		 * // System.out.println(li); li.ifPresent(System.out::println);
		 */
	}
}
