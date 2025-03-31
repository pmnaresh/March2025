package com.practice.collection;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class FailSafe {

	public static void main(String[] args) {

		// failsafe by using ConcurrentHashMap
		ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
		chm.put(1, "Naresh");
		chm.put(2, "Ramesh");
		chm.put(3, "Suresh");
		Iterator itr = chm.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			chm.put(5, "Naveen");
		}
		System.out.println("chm-->" + chm);

		// failsafe by using CopyOnWriteArrayList
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		list.add(12);
		list.add(13);
		for (Integer num : list) {
			list.add(14);
		}
		System.out.println("list-->" + list);

		// failsafe by using CopyOnWriteArraySet
		CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
		set.add(12);
		set.add(13);
		for (Integer num : set) {
			set.add(14);
		}
		System.out.println("set is -->" + set);
	}

}
