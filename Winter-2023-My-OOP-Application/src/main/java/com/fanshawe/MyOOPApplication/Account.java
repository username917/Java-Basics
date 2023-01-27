package com.fanshawe.MyOOPApplication;

public class Account {
	
	private double balance;
	
	// set balance to 0
	public Account() {
		balance = 0.0;
	}
	
	// deposit
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	// withdrawal
	public void withdrawal (double amount) {
		balance = balance - amount;
	}
	
	// net balance
	public double getBalance() {
		return balance;
	}

}
