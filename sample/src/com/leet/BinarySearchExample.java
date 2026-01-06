package com.leet;

public class BinarySearchExample {

	public static void main(String[] args) {
		int[] nums = {1, 2, 4, 7, 9}; // must be sorted
        int target = 8;
        int result = binarySearch(nums, target);
        System.out.println(result >= 0 ? "Found at index: " + result : "Not found");

	}
	public static int binarySearch(int[] arr, int target) {
		
		int left=0; int right=arr.length-1;
		
		while(left<= right)
		{
			int mid = left+(right-left)/2;
			
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]<target)
				left= mid+1;
			else
				right= mid-1;
		}
     return -1;
	
	}
}

