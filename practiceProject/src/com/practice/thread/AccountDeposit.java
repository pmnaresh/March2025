package com.practice.thread;

public class AccountDeposit extends Thread {

	Account account;

	public AccountDeposit(Account account) {
		this.account = account;
	}

	@Override
	public  void run() {
		for (int i = 0; i <= 10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			account.deposit(100);
		}

	}

}
