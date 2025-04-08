package com.practice.logical;

public class SecondHighestNumber {
	public static void main(String[] args) {
		int[] arr1 = { 12,35, 35, 1, 10, 34, 1 }; 
//		int[] arr2 = { 10, 5, 10 };
//		int[] arr3 = { 10, 10, 10 };
//		int[] arr4 = { 5 };
//		int[] arr5 = { -10, -20, -30 };

		System.out.println("Second largest in arr1: " + getSecondLargest(arr1)); // 34
//		System.out.println("Second largest in arr2: " + getSecondLargest(arr2)); // 5
//		System.out.println("Second largest in arr3: " + getSecondLargest(arr3)); // None
//		System.out.println("Second largest in arr4: " + getSecondLargest(arr4)); // None
//		System.out.println("Second largest in arr5: " + getSecondLargest(arr5)); // -20
	}

	static int getSecondLargest(int[] input) {
		int temp;
		
		if (input.length < 2) {
			System.out.println("Array should have at least two elements.");
			return Integer.MIN_VALUE;
		}
		//12, 35, 1, 10, 34, 1
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] < input[j]) {
					temp = input[j];
					input[j] = input[i];
					input[i] = temp;
				}
			}
		}
		
		for(int n :input)
			System.out.println(n);

		int first = input[0];
		for (int i = 1; i < input.length; i++) {
			if (input[i] != first) {
				return input[i];
			}
		}

		System.out.println("No second largest element (all elements may be same).");
		return Integer.MIN_VALUE;
	}
}
