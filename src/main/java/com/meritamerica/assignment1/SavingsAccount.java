package com.meritamerica.assignment1;

import java.math.*;

public class SavingsAccount {
	
	private double balance = 0;
	private double interestRate = 1.0;
	private double futureValue ;
	
	public SavingsAccount(double openingBalance) {
		this.balance = openingBalance;
		toString();
	}
	public double getBalance() {
		return this.balance;
	}
	public double getInterestRate() {
		double interestR = this.interestRate /100 ;
		this.interestRate = interestR;
		return this.interestRate;
	}
	public boolean withdraw(double amount) {
		return true;
	}
	
	public boolean deposit(double amount) {
		if (0 <= amount) {
			this.balance = this.balance + amount;
			return true;
		} 	else {
		System.out.println("Error found: The amount entered for deposit on your Savings Account could not be processed. "); // This line will kick in if the amount is negative. so it wont add new balance
																										
		return false;
			}	
		
	}
	public double futureValue(int years) {
		double futureV = balance * Math.pow((1+interestRate), 3);
		this.futureValue = futureV;
		return this.futureValue;
	}
	public String toString() {
		String savingsAccount = "";
		
		return savingsAccount;
	}
}