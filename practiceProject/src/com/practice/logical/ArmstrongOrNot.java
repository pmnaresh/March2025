package com.practice.logical;

public class ArmstrongOrNot {

	public static void main(String[] args) {
		int number =153;
		int result =0;
		int temp =number;
		int sum=0;
		
		while(number>0) {
			result =number%10;
			number =number/10;
			sum=sum+result*result*result;
		}
		
		if (temp == sum) {
			System.out.println(temp + " is a armStrong");
		} else {
			System.out.println(temp + " is not a armStrong");
		}
	}

}
