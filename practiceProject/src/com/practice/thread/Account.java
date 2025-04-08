package com.practice.thread;

public class Account {

	private long accNumber;
	private double amount;

	public Account(long accNumber, double amount) {
		this.accNumber = accNumber;
		this.amount = amount;
	}

	public void deposit(double amount1) {

		this.amount = amount + amount1;

		System.out.println("closing balance in deposit " + this.amount);

	}

	public void withdraw(double amount1) {

		this.amount = amount - amount1;

		System.out.println("closing balance in withdrawn " + this.amount);

	}
}
