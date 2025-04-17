package com.practice.intervew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SpiensTest {

	public static void main(String[] args) {

		
		// to find sum of two numbers =54 between 1 to 100 by using streams
		IntStream.rangeClosed(1, 100).boxed().flatMap(
				i -> IntStream.rangeClosed(i + 1, 100).filter(j -> i + j == 54).mapToObj(j -> i + " + " + j + " =54"))
				.forEach(System.out::println);
		
		System.out.println("*********************");
		
		// to find sum of two numbers =54 between 1 to 100 by using for loop
		for(int i =1;i<=100;i++) {
			for(int j =i+1;j<=100;j++) {
				if(i+j==54) {
					System.out.println( i+" + "+j +" =54");
				}
			}
		}

		// missing integers in list by using for loop
		List<Integer> li = Arrays.asList(1,2,3,5,7,8,10);
		List<Integer> missingIntegers =new ArrayList<>();
		
		for(int i =1 ;i<10;i++) {
			if(!li.contains(i)) {
				missingIntegers.add(i);
			}
		}
		System.out.println(missingIntegers);
		
		//missing integers in list by using streams
		 List<Integer> missingIntegers1 = IntStream.rangeClosed(1, 10)
	                .filter(i -> !li.contains(i))
	                .boxed()
	                .collect(Collectors.toList());
	        System.out.println(missingIntegers1);
	        
		//input [1,-1,0,0,1,-1,0]
		//output[0,0,0,1,-1,1,-1]
		int[] intArr = { 1, -1, 0, 0, 1, -1, 0 };
		int[] updatedArr = new int[intArr.length];
		int c = 0;
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] == 0) {
				updatedArr[c] = intArr[i];
				c++;
			}
		}
		for (int j = 0; j < intArr.length; j++) {
			if (intArr[j] != 0) {
				updatedArr[c] = intArr[j];
				c++;
			}
		}
		for (int a : updatedArr)
			System.out.println(a);
	}

}
