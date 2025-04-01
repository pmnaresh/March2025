package com.practice.logical;

public class FabinocciSeries {

	public static void main(String[] args) {
		int number = 10;
		int a = 0;
		int b = 1;
		int c = 0;

		System.out.print(a);
		System.out.print("," + b);

		for (int i = 2; i <= number; i++) {
			c = a + b;
			System.out.print("," + c);
			a = b;
			b = c;
		}

	}

}
