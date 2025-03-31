package com.practice.logical;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StandAloneProject {
	public static void main(String[] args) {
		HashMap<String, Integer> hashmap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int count = 1;
		boolean status = false;
		while (1 > 0) {
			System.out.println("Enter Username :");
			String userName = sc.next();
			Iterator itr = hashmap.entrySet().iterator();
			if (hashmap.isEmpty()) {
				System.out.println(userName + " logged in for the " + count + "st time");
				hashmap.put(userName.toUpperCase(), count);
			}
			while (itr.hasNext()) {
				Map.Entry<String, Integer> entry = (Entry<String, Integer>) itr.next();
				if (userName.equalsIgnoreCase(entry.getKey())) {
					count = entry.getValue() + 1;
					System.out.println(userName + " logged in for the " + count + " time");
					status = true;
					break;
				} else if (!hashmap.containsKey(userName.toUpperCase())) {
					System.out.println(userName + " logged in for the " + count + " time");
					status = true;
					break;
				}
			}
			if (status == true) {
				hashmap.put(userName.toUpperCase(), count);
				count = 1;
			}
			System.out.println(hashmap);
		}
	}

}
