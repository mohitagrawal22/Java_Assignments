package com.masaiDay5Q3;

public class Account {
	private int accountId;
	private String accountType;
	private int balance;
	
	public Account() {
		
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public boolean withdraw(int amount) {
		int balance = getBalance();
		if(balance > amount) {
			balance -= amount;
			setBalance(balance);
			System.out.println("Balance amount after Withdraw: " + balance);
			return true;
		}
		else {
			System.out.println("Sorry! Not enough balance");
			return false;
		}
	}
}