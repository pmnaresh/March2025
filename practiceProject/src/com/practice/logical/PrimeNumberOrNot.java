package com.practice.logical;

public class PrimeNumberOrNot {

	public static void main(String[] args) {

		int number = 20;
		int result = 0;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				result = result + 1;
			}
		}
		if (result == 0) {
			System.out.println(number + "is a prime number");
		} else {
			System.out.println(number + " is not  a prime numnber");
		}
	}
}
