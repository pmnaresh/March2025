package com.leet;

public class LinearSeacrchExample {

	public static void main(String[] args) {
		int[] nums = {4, 2, 9, 1, 7};
        int target = 1;
        int result = getIndex(nums, target);
        System.out.println(result);

	}

	 public static int getIndex(int[] ar,int target)
	 {
		 for(int i=0; i<ar.length ; i++)
		 {
			 if(ar[i] == target)
				 return i;
		 }
		return -1;
		 
	 }
}
