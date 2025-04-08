package com.practice.thread;

public class AccountMain {

	public static void main(String[] args) throws InterruptedException {
		Account acc = new Account(101,2000);
		
		AccountDeposit ad= new AccountDeposit(acc);
		AccountWithdraw aw = new AccountWithdraw(acc);
		
		ad.start();
		aw.start();
		
		
		
//		ad.setPriority(Thread.MAX_PRIORITY);
//		aw.setPriority(Thread.MIN_PRIORITY);
		
//		try {
//			ad.join();
//			aw.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	

}
