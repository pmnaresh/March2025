package com.practice.streams;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamExamples {

	public static void main(String[] args) {

		// max value
		IntStream intstream = IntStream.of(1, 2, 3, 4, 5);
		System.out.println(intstream.max());
		// Min value
		IntStream intstream1 = IntStream.of(1, 2, 3, 4, 5);
		System.out.println(intstream1.min());
		// sum of all numbers
		IntStream intstream2 = IntStream.of(1, 2, 3, 4, 5);
		System.out.println(intstream2.sum());

		// range ->excludes 10
		IntStream.range(1, 10).forEach(System.out::println);

		// rangeclosed -> does not exclude 10
		IntStream.rangeClosed(1, 10).forEach(System.out::println);

		System.out.println("***********");
		List<String> listOfStream = List.of("1", "2", "3", "4");
		int sum = listOfStream.stream().mapToInt(n->Integer.parseInt(n)).sum();
		System.out.println("sum-->" + sum);
		int sum1 = listOfStream.stream().mapToInt(Integer::parseInt).sum();
		System.out.println("sum1-->" + sum1);

		System.out.println("String to double");
		listOfStream.stream().mapToDouble(Double::parseDouble).forEach(System.out::println);

		System.out.println("String to long");
		listOfStream.stream().mapToLong(Long::parseLong).forEach(System.out::println);

	}

}
