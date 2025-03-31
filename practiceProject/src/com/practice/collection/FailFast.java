package com.practice.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(new Integer(12));
		list.add(12);
		list.add(2);
		list.add(124);

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			list.remove(0); // throw concurrent modifiaction exception
		}

		// by using for each
		for (Integer num : list) {
			list.add(12); // throw concurrent modification exception
		}

	}

}
