package com.practice.streams;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StreamsOnMap {

	public static void main(String[] args) {

		Map<String, Integer> hm = Map.of("Naresh", 21, "Suresh", 22, "Naveen", 13, "bhaddam", 7, "bharath", 34);

		Set<Map.Entry<String, Integer>> entry = hm.entrySet();
		// key based sorting
		entry.stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		System.out.println("**********");

		// value based sorting
		entry.stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

		System.out.println("__________________");
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(9, "Potato");
		hashMap.put(2, "Chilli");
		hashMap.put(18, "Tomato");
		hashMap.put(91, "RedChilli");
		hashMap.put(51, "Brinjal");
		hashMap.put(98, "onion");
		hashMap.put(5, "cucumber");

		Iterator itr = hashMap.entrySet().iterator();

		// to get entries
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// fetch keySet from hashmap
		Set<Integer> keySet = hashMap.keySet();
		System.out.println("key set is--->" + keySet);

		// fetch values from hashmap
		Collection<String> values = hashMap.values();
		System.out.println("values are -->" + values);

		Iterator itr1 = hashMap.entrySet().iterator();
		// customised key and values from map on every itreation
		while (itr1.hasNext()) {
			Map.Entry<Integer, String> en = (Entry<Integer, String>) itr1.next();

			System.out.println("key-->" + en.getKey());
			System.out.println("value-->" + en.getValue());
		}
	}

}
