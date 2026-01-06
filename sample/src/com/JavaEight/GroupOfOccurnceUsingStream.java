package com.JavaEight;

import java.util.Map;
import java.util.stream.Collectors;

public class GroupOfOccurnceUsingStream {

	public static void main(String[] args) {
		
		
		String s="Naveeen";
		
		
//		Map<Character, Long> map=s.chars().mapToObj(c ->(char) c).collect(Collectors.groupingBy(c-> c, Collectors.counting()));
//		System.out.println("Characters appearing more than 2 times:");
//
//		System.out.println(map);
//		      map.entrySet().stream().filter(c-> c.getValue()>2).forEach(System.out::println);
//		s.chars().mapToObj(c ->(char) c ).collect(Collectors.groupingBy(c->c,Collectors.counting()));
//		   Map<Character,Long> map= s.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(l ->l ,Collectors.counting()));
//		   System.out.println(map);
//		   map.entrySet().stream().filter(f->f.getValue()>2).forEach(System.out::println);
		
		
	Map<Object, Long> map=	s.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(o -> o,Collectors.counting()));
	
	   map.entrySet().stream().filter(i ->i.getValue()>2).forEach( p ->System.out.println(p));
	}

}
