package com.test;

public class FindShortestNumber {

	public static void main(String[] args) {

  int [] ar= {1,5,6,8,14,36,78};
  
  int s =findFloorIndex(ar,38);
  System.out.println(s);
 int l= linearSearch(ar,78);
 System.out.println(l);

	}
	public static int linearSearch(int[] arr, int target) {
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == target) {
	            return i; // Found
	        }
	    }
	    return -1; // Not found
	}

	public static int findFloorIndex(int[] arr, int target) {
	    int left = 0, right = arr.length - 1;
	    int result = -1;

	    while (left <= right) {
	        int mid = left + (right - left) / 2;

	        if (arr[mid] == target) {
	            return mid; // Exact match
	        } else if (arr[mid] < target) {
	            result = mid; // Potential floor
	            left = mid + 1;
	        } else {
	            right = mid - 1;
	        }
	    }

	    return result; // Index of floor value, or -1 if none found
	}

}
