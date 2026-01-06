package com.practice.logical;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		int number1=1200;
		int number2 =2000;
		int temp =0;
		System.out.println("number 1 before sort "+number1);
		System.out.println("number 2 before sort "+number2);
		temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("***********");
		System.out.println("number 1 after sort "+number1);
		System.out.println("number 2 after sort "+number2);
		
		number1 = number1+number2;//3200
		number2=number1-number2;//1200
		number1=number1-number2;

	}

}
