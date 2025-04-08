package com.practice.thread;

public class Main {

	public static void main(String[] args) {
		Thread1 t1 =new Thread1();
		Thread2 t2 =new Thread2();
		
//		t1.run();
//		t2.run();// synchronous exicution
		
		Thread newT1=new Thread(t1);
		Thread newT2 = new Thread(t2);
		
		newT1.start();
		newT2.start(); // asynchronous exicution
		

	}

}
