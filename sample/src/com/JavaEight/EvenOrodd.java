package com.JavaEight;

import java.util.Arrays;
import java.util.List;

public class EvenOrodd {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,5,77,3,8,9,25);
		
		list.stream().filter(n->n%2==0).forEach(System.out::println);

	}

}
