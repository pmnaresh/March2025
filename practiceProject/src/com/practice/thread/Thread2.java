package com.practice.thread;

public class Thread2 implements Runnable {

	@Override
	public synchronized void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("5 X " + i + " = " + 5 * i);
		}
	}
}
