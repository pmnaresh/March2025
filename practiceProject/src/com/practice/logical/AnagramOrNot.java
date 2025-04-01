package com.practice.logical;

import java.util.Arrays;

public class AnagramOrNot {

	public static void main(String[] args) {
		String str1 = "Naresh";
		String str2 = "naresh";
		boolean status = true;
		if (str1.length() != str2.length()) {
			status = false;
			System.out.println("Not a anagram");
		} else {
			char[] arr1 = str1.toLowerCase().toCharArray();
			char[] arr2 = str2.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			status = Arrays.equals(arr1, arr2);
			if (status == true)
				System.out.println("it is anagram");
			else
				System.out.println("not a anagaram");
		}

	}

}
