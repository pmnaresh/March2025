package com.practice.logical;

import java.util.Arrays;

public class SecondHighestInArray {

	public static void main(String[] args) {
		int[] arr1 = { 12, 35, 35, 1, 10, 34, 1 };
		System.out.println("Second largest in arr1: " + getSecondLargest(arr1)); // 34

	}
	private static Integer getSecondLargest(int[] arr1) {
		int temp;
		if (arr1.length < 2) {
			System.out.println("elements are less than to 2 comparision isnot possible");
			return Integer.MIN_VALUE;
		}
		
		Arrays.sort(arr1);
//		int[] arr2 = new int[arr1.length];
//		int k=0;
//		for(int i =arr1.length-1;i>=0;i--) {
//			
//			arr2[k]=arr1[i];
//			k++;
//			
//		}
		
		
//		for(int n :arr2) {
//		System.out.println(n);
//		}
		
		int last = arr1[arr1.length-1];
		for (int i = arr1.length-1; i >=0; i--) {
			if (last != arr1[i]) {
				return arr1[i];
			}
		}
		System.out.println("*****");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] < arr1[j]) {
					temp = arr1[j];
					arr1[j] = arr1[i];
					arr1[i] = temp;
				}
			}
		}
		int first = arr1[0];
		for (int i = 1; i < arr1.length; i++) {
			if (first != arr1[i]) {
				return arr1[i];
			}
		}
		System.out.println("No second largest element (all elements may be same).");
		return Integer.MIN_VALUE;
	}

}
