package com.leet;

public class NearestNumberUsingBinarySearch {

	public static void main(String[] args) {
		
		
		int[] sortedArray = {1,3,5,7,9,11,74,77,80,82,86};
        int target = 68;
        int result = getNearestNumber(sortedArray, target);
        System.out.println("Closest number to " + target + " is: " + result);
	}
	
	public static int getNearestNumber(int[] ar, int target)
	{
		int left=0; int right = ar.length-1;
		
		if(target<= ar[0])
			return ar[0];
		if(target>=ar[ar.length-1])
			return ar[ar.length-1];
		
		
		while(left<= right )
		{
			int mid = left+(right-left)/2;
			
			if(ar[mid] == target)
				 return ar[mid];
			else if( target< ar[mid])
				 right = mid-1;
			else
				left= mid+1;
		}
		
//		 if ((ar[left] - target) < (target - ar[left - 1])) {
//	            return ar[left];
//	        } else {
//	            return ar[left - 1];
//	        }
		
		if ((ar[left] - target < (target - ar[left - 1]))) {
			return ar[left];

		} else {
			return ar[left - 1];
		}
		
		 
	}
}
	
		
				
		
		
	

