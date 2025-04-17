package com.practice.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hm=new HashMap<>();
		
		hm.put(1, "Naresh kumar");
		System.out.println(hm.getOrDefault(2, null));
		
		System.out.println(hm);
		TreeMap<Integer, String> treeMap=new TreeMap<>();
		treeMap.put(9, "Potato");
		treeMap.put(2, "Chilli");
		treeMap.put(18, "Tomato");
		treeMap.put(91, "RedChilli");
		treeMap.put(51, "Brinjal");
		treeMap.put(98, "onion");
		treeMap.put(5, "cucumber");
		System.out.println(treeMap.size());
		
		for(Entry<Integer, String> entry :treeMap.entrySet()) {
			System.out.println(entry);
		}
		
		
		
		TreeMap<Student, Integer> studentTreeMap= new TreeMap<>();
		studentTreeMap.put(new Student(12, "Naresh", "Angallu", 89), 21);
		studentTreeMap.put(new Student(1, "Suresh", "Angallu", 89), 21);
		studentTreeMap.put(new Student(2, "Ramachndra", "Angallu", 89), 21);
		studentTreeMap.put(new Student(126, "Naveen", "Angallu", 89), 21);
		studentTreeMap.put(new Student(192, "Ramu", "Angallu", 89), 21);
		studentTreeMap.put(new Student(102, "Raju", "Angallu", 89), 21);
		studentTreeMap.put(new Student(102, "Naresh", "Angallu", 89), 21);
		studentTreeMap.put(new Student(187, "Suresh", "Angallu", 89), 21);
		
		for(Entry<Student, Integer> entry :studentTreeMap.entrySet()) {
			System.out.println(entry);
		}
	}

}
