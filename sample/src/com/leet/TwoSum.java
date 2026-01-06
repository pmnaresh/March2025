package com.leet;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		

		int [] ar = {12,9,67,34,90,23};
		int[] lo=getTwoSum(ar,124);
		for(int i=0; i<lo.length; i++)
		{
			System.out.print(lo[i]+",");
		}
	}
	
	public static int[] getTwoSum(int [] arr,int target)
	{
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length ;i++)
		{
			int complaint = target-arr[i];
			
			if(map.containsKey(complaint))
			{
				return new int [] {map.get(complaint),i};
			}
			map.put(arr[i], i);
			
		}
		return new int[0];
		
	}

}
