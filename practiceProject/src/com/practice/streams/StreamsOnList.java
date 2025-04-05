package com.practice.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsOnList {

	public static void main(String[] args) {
		
		String input = "Hello";
		// Reverse using streams
		String reversed = IntStream.range(0, input.length()).mapToObj(i -> input.charAt(input.length() - 1 - i))
				.map(String::valueOf).collect(Collectors.joining());
		System.out.println("Reversed String: " + reversed);

		List<Integer> numberList = Arrays.asList(12, 13, 14, 17, 16, 56, 78, 98, 12, 13, 14, 17);

		// evenNumbers
		List<Integer> evenNumberList = numberList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("even Numbers from list are -->" + evenNumberList);

		// oddNumbers
		List<Integer> oddNumberList = numberList.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println("Odd Numbers from list are -->" + oddNumberList);

		// evenodd
		Map<Boolean, List<Integer>> evenOddMap = numberList.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

		List<Integer> evenNumbers = evenOddMap.get(true);
		List<Integer> oddNumbers = evenOddMap.get(false);

		System.out.println("Even Numbers: " + evenNumbers);
		System.out.println("Odd Numbers: " + oddNumbers);

		// Squares of Each number
		List<Integer> squareOfNumber = numberList.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println("Sqaures of numbers are -->" + squareOfNumber);

		// count of numbers from list
		long countofnumbers = numberList.stream().count();
		System.out.println("countofnumbers from a list are -->" + countofnumbers);

		// second highest number
		Optional<Integer> secondHighestNumber = numberList.stream().sorted(Comparator.reverseOrder()).skip(1)
				.findFirst();
		System.out.println("secondHighestNumber is " + secondHighestNumber);

		// sum of numbers in a list
		Integer total = numberList.stream().reduce(0, Integer::sum);
		System.out.println("sum of numbers is -->" + total);

		// Distinct numbers
		List<Integer> uniqueNumberList = numberList.stream().distinct().collect(Collectors.toList());
		System.out.println("uniqueNumberList -->" + uniqueNumberList);

		// assending order
		List<Integer> assendingOrderList = numberList.stream().sorted(Comparator.naturalOrder())
				.collect(Collectors.toList());
		System.out.println("assendingOrderList-->" + assendingOrderList);

		List<String> names = List.of("Apple", "Candy", "Banana", "Avocado", "Blueberry");
		Map<Object, List<String>> groupedByFirstLetter = names.stream()
				.collect(Collectors.groupingBy(name -> name.charAt(0)));
		System.out.println("groupedByFirstLetter-->" + groupedByFirstLetter);

		// to uppercase
		names.stream().map(String::toUpperCase).forEach(System.out::println);

		List<String> orderByNames = names.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println("orderByNames-->" + orderByNames);

		// starts with A
		List<String> startsWithAlist = names.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList());
		System.out.println("startsWithAlist-->" + startsWithAlist);

		// flatmap
		List<List<String>> listOfLists = List.of(List.of("A", "B"), List.of("C", "D", "E"));
		List<String> flattenedList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println("flattenedList-->" + flattenedList); // [A, B, C, D, E]

	}

}
