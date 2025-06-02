package com.test;

public class Main {

	public static void main(String[] args) {
//		Problem Statement #
//
//		Given an array of positive numbers and a positive number ‘k,’
//
//		find the maximum sum of any contiguous subarray of size ‘k’.
//
//		Example 1:
//
//		Input: [2, 1, 5, 1, 3, 2], k=3 
//
//		Output: 9
//
//		Explanation: Subarray with maximum sum is [5, 1, 3].
//
//		Example 2:
//
//		Input: [2, 3, 4, 1, 5], k=2 
//
//		Output: 7
//
//		Explanation: Subarray with maximum sum is [3, 4].
		
		int out1=findMaxSumSubArray(new int[] {2, 1, 5, 1, 3, 2},3);
		System.out.println(out1);
		int out2=findMaxSumSubArray(new int[] {2,3,4,1,5},2);
		System.out.println(out2);
		
		//post -> User details (userFullName ,monile number and email Id )
		//get -> Allusers and particular user 

		
		
	}

	public static int findMaxSumSubArray(int[] arr , int k ) {
		
		int maxSum =0;
		int start=0;
		int end=0;
		
		for(int end1=0;end1<arr.length;end1++) {
			start+=arr[end1];
			
			if(end1>=k-1) {
				maxSum=Math.max(maxSum, start);
				start -=arr[end];
				end++;
			}
		}
		return maxSum;
	}
}
