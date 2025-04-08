package com.practice.logical;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class MultiThreadHandle {
	static AtomicInteger var = new AtomicInteger(5);

	public synchronized void test1() {
		System.out.println("Inside Test1 Method : " + var.incrementAndGet());
		while (true) {
			try {
				Thread.sleep(Long.MAX_VALUE);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static synchronized void test2() {
		System.out.println("Inside Test2 Method : " + var.incrementAndGet());
		while (true) {
			try {
				Thread.sleep(Long.MAX_VALUE);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		MultiThreadHandle obj = new MultiThreadHandle();
//		obj.test1();   // instance level locking
//		MultiThreadHandle.test2(); // classlevel locking
		
		
		ExecutorService executor = Executors.newFixedThreadPool(10);

        Runnable runnableTask1 = () -> obj.test1();
        Runnable runnableTask2 = () -> obj.test2();

        executor.execute(runnableTask1);
        executor.execute(runnableTask2);
	}
}
