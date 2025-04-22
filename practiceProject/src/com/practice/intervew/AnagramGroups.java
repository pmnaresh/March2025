package com.practice.intervew;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import java.util.*;
import java.util.stream.Collectors;

public class AnagramGroups {
	public static void main(String[] args) {
		List<String> inputList = Arrays.asList("abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm");

		Collection<List<String>> result = inputList.stream()
				.collect(Collectors.groupingBy(
						str -> str.chars().sorted().mapToObj(c -> String.valueOf((char) c))
								.collect(Collectors.joining()),
						LinkedHashMap::new, // to preserve input order in groups
						Collectors.toList()))
				.values().stream().filter(group -> group.size() > 1).collect(Collectors.toList());

		result.forEach(System.out::println);
	}
}
