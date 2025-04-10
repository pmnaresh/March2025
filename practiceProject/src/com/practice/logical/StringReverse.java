package com.practice.logical;

public class StringReverse {

	public static void main(String[] args) {
		String str = "i love india";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		// String buffer
		StringBuffer sb = new StringBuffer("Naresh");
		System.out.println(sb.reverse());

		// join
		String st = String.join("-", "i ", "am ", "Naresh");
		System.out.println(st);
	}

}
