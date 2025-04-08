package com.practice.logical;

public class SecondHighestInArray {

	public static void main(String[] args) {
		int[] arr1 = { 12, 35, 35, 1, 10, 34, 1 };
		System.out.println("Second largest in arr1: " + getSecondLargest(arr1)); // 34

	}

	private static Integer getSecondLargest(int[] arr1) {
		int temp;
		if (arr1.length < 2) {
			System.out.println("elements are less than to array");
			return Integer.MIN_VALUE;
		}

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
