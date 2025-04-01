package com.practice.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsOnList {

	public static void main(String[] args) {

		List<Integer> numberList =Arrays.asList(12,13,14,17,16,56,78,98,12,13,14,17);
		
		//evenNumbers
		List<Integer> evenNumberList=numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("even Numbers from list are -->"+evenNumberList);
		
		//oddNumbers
		List<Integer> oddNumberList= numberList.stream().filter(n->n%2 !=0).collect(Collectors.toList());
		System.out.println("Odd Numbers from list are -->"+oddNumberList);
		
		//Squares of Each number
		List<Integer> squareOfNumber =numberList.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println("Sqaures of numbers are -->"+squareOfNumber);
		
		//count of numbers from list
		long countofnumbers =numberList.stream().count();
		System.out.println("countofnumbers from a list are -->"+countofnumbers);
		
		//second highest number 
		Optional<Integer> secondHighestNumber =numberList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println("secondHighestNumber is "+secondHighestNumber);
		
		//sum of numbers in a list
		Integer total =numberList.stream().reduce(0,Integer::sum);
		System.out.println("sum of numbers is -->"+total);
		
		//Distinct numbers	
		List<Integer> uniqueNumberList=	numberList.stream().distinct().collect(Collectors.toList());
		System.out.println("uniqueNumberList -->"+uniqueNumberList);
		
		//assending order
		List<Integer> assendingOrderList= numberList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println("assendingOrderList-->"+assendingOrderList);
		
	}

}
