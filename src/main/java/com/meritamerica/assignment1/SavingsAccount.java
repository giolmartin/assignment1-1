package com.meritamerica.assignment1;

import java.math.*;

public class SavingsAccount {
	
	private double balance;
	private double interestRate = 0.01;
	private double futureValue ;
	
	public SavingsAccount(double openingBalance) {
		deposit(openingBalance);	
		futureValue(3);
		toString();
	}
	public double getBalance() {
		return this.balance;
	}
	public double getInterestRate() {
		return this.interestRate;
	}
	public boolean withdraw(double amount) {
		if(this.balance >= amount) {
			this.balance = this.balance - amount;
			return true;
		}	else {
			System.out.println("Error found: The amount entered for withdraw could not be processed."); // This line will kick in if the amount is negative. so it wont add new balance																						
			return false;	
			}
	}
	
	public boolean deposit(double amount) {
		if (0 <= amount) {
			this.balance = this.balance + amount;
			return true;
		} 	else {
			System.out.println("Error found: The amount entered for deposit could not be processed."); // This line will kick in if the amount is negative. so it wont add new balance																						
			return false;
			}	
		
	}
	public double futureValue(int years) {
		this.futureValue = balance * Math.pow((1+ interestRate ), 3);
		return this.futureValue;
	}
	public String toString() {
		String savingsAccount = "Balance: $" + this.balance +"\n" +
								"Interest Rate: " +this.interestRate + "\n"+ 
								"Balance in 3 years: " + this.futureValue ;;
		return savingsAccount;
	}
}