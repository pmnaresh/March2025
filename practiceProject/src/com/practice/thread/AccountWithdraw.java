package com.practice.thread;

public class AccountWithdraw extends Thread {

	Account account;

	public AccountWithdraw(Account account) {
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
			account.withdraw(100);
		}
	}
}
