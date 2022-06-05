package com.masaiDay5Q3;

import java.util.Scanner;

public class AccountDetails {
	
	static Scanner sc = new Scanner(System.in);
	
	public Account getAccountDetails() {
		Account acc = new Account();
		
		System.out.println("Enter Account Id");
		acc.setAccountId(sc.nextInt());
		
		System.out.println("Enter Account Type");
		acc.setAccountType(sc.next());
		
		System.out.println("Enter Account Balance:");
		int balance = sc.nextInt();
		while(balance <= 0) {
			System.out.println("Error! Balance should be positive");
			System.out.println("Enter Account Balance:");
			balance = sc.nextInt();
		}
		
		acc.setBalance(balance);
		
		return acc;
	}
	
	
	public int getWithdrawAmount() {
		System.out.println("Enter amount to be withdrawn:");
		int amount = sc.nextInt();
		while(amount<=0) {
			System.out.println("Error! Withdraw amount should be positive");
			System.out.println("Enter amount to be withdrawn:");
			amount = sc.nextInt();
		}
		
		return amount;
	}
	
	
	public static void main(String[] args) {
		
		AccountDetails ad = new AccountDetails();
		
		Account acc = ad.getAccountDetails();
		
		int withdrawAmount = ad.getWithdrawAmount();
		
		acc.withdraw(withdrawAmount);
		
		sc.close();
	}
}