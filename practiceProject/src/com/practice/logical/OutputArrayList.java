package com.practice.logical;

import java.util.ArrayList;

public class OutputArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			arrayList.add(i * 2);
		}
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) % 3 == 0) {
				arrayList.remove(i);
			}
		}
		System.out.println(arrayList);
	}

}
