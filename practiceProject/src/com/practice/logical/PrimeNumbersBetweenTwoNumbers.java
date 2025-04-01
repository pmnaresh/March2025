package com.practice.logical;

public class PrimeNumbersBetweenTwoNumbers {

	public static void main(String[] args) {
		int num = 100;
		int fact = 0;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i % j == 0) {
					fact++;
				}
			}
			if (fact <= 2) {
				System.out.print(i + ",");
			}
			fact = 0;
		}

	}

}
