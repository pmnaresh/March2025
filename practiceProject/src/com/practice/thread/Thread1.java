package com.practice.thread;

public class Thread1 implements Runnable {

	@Override
	public synchronized void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("7 X " + i + " = " + 7 * i);

		}
	}
}
