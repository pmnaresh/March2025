package com.leet;

import java.util.HashMap;

public class PrintIndexesSum {

	
	  public   static int[] twoSum(int[] nums, int target) {
	        HashMap<Integer, Integer> map = new HashMap<>(); 
	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];
	            if (map.containsKey(complement)) {
	                return new int[]{ map.get(complement), i };
	            }
	            map.put(nums[i], i);
	        }
	        return new int[0];
	    }
	  
	  
	  public static int[] twoSumw(int[] nums, int target) {
		    for(int i = 0; i < nums.length; i++) {
		        for(int j = i + 1; j < nums.length; j++) {
		            if(nums[i] + nums[j] == target) {
		                return new int[]{nums[i], nums[j]};
		            }
		        }
		    }
		    return new int[]{}; // no pair found
		}
	public static void main(String[] args) {

		int[] ljk=new int[]{2,7,11,15};
		int target= 26;
		int[]sd= twoSum(ljk,18);
		
		for(int i=0; i<sd.length;i++)
		{
			System.out.print(sd[i]+",");
		}
		
		int[] po=twoSumw(ljk,target);
		
		for(int i=0; i<po.length;i++)
		{
			System.out.print(po[i]+",");
		}
		
		

	}

}
