package com.practice.logical;

public class PalindromeOrNot {

	public static void main(String[] args) {

		int number = 353;
		int res = 0, sum = 0, temp = 0;
		temp = number;

		while (number > 0) {
			res = number % 10;
			number = number / 10;
			sum = sum * 10 + res;
		}

		if (temp == sum) {
			System.out.println(temp + " is a pallindrome");
		} else {
			System.out.println(temp + " is not a pallindrome");
		}

	}

}
