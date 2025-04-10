package com.practice.logical;

import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, String> cityCode = new HashMap<String, String>();
		cityCode.put("India", "Kolkata");
		cityCode.put("Russia", "Moscow");
		cityCode.put("USA", "New York");

		System.out.println(cityCode.keySet());

		Iterator<String> iterator = cityCode.keySet().iterator();

		while (iterator.hasNext()) {
			String country = iterator.next();
			if ("India".equals(country)) {
				cityCode.put("India", "Delhi"); // this is OK --try to current key ,not a structural change
				cityCode.put("Pakisthan", "Lahore"); // this causes ConcurrentModificationException ,its a structural
														// change
			}
			System.out.println("Country : " + country + ", Capitol : " + cityCode.get(country));
		}
	}
}
