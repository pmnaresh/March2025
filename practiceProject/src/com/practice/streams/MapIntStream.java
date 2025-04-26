package com.practice.streams;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class MapIntStream {

	public static void main(String[] args) {
		IntStream intStream = IntStream.of(1, 2, 3, 4, 5);

		// Square each number
		IntStream squaredStream = intStream.map(n -> n * n);
		squaredStream.forEach(System.out::println);
		// Output: 1, 4, 9, 16, 25

		IntStream intStream1 = IntStream.of(1, 2, 3, 4, 5);
		// Convert to DoubleStream by adding 0.5 to each number
		DoubleStream doubleStream = intStream1.mapToDouble(n -> n + 0.5);
		doubleStream.forEach(System.out::println);
		// Output: 1.5, 2.5, 3.5, 4.5, 5.5
		
		IntStream intStream3 = IntStream.of(1, 2, 3, 4, 5);
		// Convert to LongStream by multiplying with 1000
		LongStream longStream = intStream3.mapToLong(n -> (long) n * 1000);
		longStream.forEach(System.out::println);
		// Output: 1000, 2000, 3000, 4000, 5000
		
		
		List<String> numbers = List.of("1", "2", "3", "4", "5");
		// Convert to IntStream using mapToInt
		int sum = numbers.stream()
		                  .mapToInt(Integer::parseInt)
		                  .sum();
		System.out.println("Sum: " + sum); // Sum: 15
	}

}
