package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondMaxValueInarray {

	public static void main(String[] args) {
		
		
		int [] arr = {12,7,34,8,25,15,9,24,26,9};
		
		int firstMax =0;
		int secondMax=0;
		int thirdMax=0;
		
		for(int es : arr)
		{
			
			if(es>firstMax)
			{
				secondMax=firstMax;
				firstMax=es;
			}
			
			else if(es>secondMax)
			{
				thirdMax=secondMax;
				secondMax=es;
			}
			else if(es>thirdMax && es != thirdMax && es != thirdMax)
			{
				thirdMax=es;
			}
		}
		System.out.println(thirdMax);
		
		
		Optional<Integer> op=Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst();
	
	
	}

}
