package com.leet;

import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingHashMap {

	public static void main(String[] args) {
		int [] ar = {12,9,67,34,90,23};
		int[] lo=getSumTwo(ar,124);
		for(int i=0; i<lo.length; i++)
		{
			System.out.print(lo[i]+",");
		}

	}
	
	public static int[] getSumTwo(int[] ar,int target)
	{
		Map<Integer,Integer> map =new HashMap<>();
		
		for(int i=0; i<ar.length; i++)
		{
			int complaint = target-ar[i];
			if(map.containsKey(complaint)) {
				//return new int[] {map.get(complaint),i};
				return new int[] {map.get(complaint),ar[i]};
			}
			map.put(ar[i], ar[i]);
		}
		return  new int[0];
		
	}

}
