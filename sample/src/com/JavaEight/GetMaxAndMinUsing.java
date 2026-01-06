package com.JavaEight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class GetMaxAndMinUsing {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(12,34,89,2,4,16,78,46);
		
		Integer s=list.stream().max(Integer::compareTo).get();
		System.out.println(s);
		
		Integer i=list.stream().min(Integer::compareTo).get();
		System.out.println(i);
		 
		list.stream().max(Integer::compareTo).get();
		
		Integer l=list.stream().max(Integer::compareTo).get();
		
		
		Optional<Integer>op =list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(op.get());
		
		
		 List<String> words = Arrays.asList("Java", "Python", "JavaScript");
		 
		 words.forEach(sl->System.out.println(sl+":"+sl.length()));
	}

}
