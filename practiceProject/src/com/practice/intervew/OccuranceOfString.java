package com.practice.intervew;

public class OccuranceOfString {

	public static void main(String[] args) {

		String str = "Hello: Welcome:to:java";

		int count = 0;
		String str2 = "java";

		String[] strArray = str.split(":");

		for (String it : strArray) {
			if (it.equalsIgnoreCase(str2)) {
				count = count + 1;
			}
		}

		System.out.println("occurnece of java in above sentence is -->" + count);

		count = 0;
//		System.out.println(strArray[0]);

	}

}
