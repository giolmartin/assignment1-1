package com.meritamerica.assignment1;

import java.util.Scanner;
import java.math.*;
import java.text.DecimalFormat;

public class CheckingAccount {
	
	private double balance ;	
	private double interestRate = 0.0001;
	private double futureValue  ; 
	/*
	 * Here im still not sure where we need to do the math to deposit or withdraw. Is it on the boolean method or on the constructor? 
	 * i kind of played around with the balances just to see if the amounts were being called and written. 
	 */
	public CheckingAccount(double openingBalance) {
		deposit(openingBalance);	
		futureValue(3);
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getInterestRate() {
		double interestAmount = this.interestRate;
		return interestAmount;
	}
	public boolean withdraw(double amount) {
		if(this.balance >= amount) {
			this.balance = this.balance - amount;
			return true; 
		} 	else {
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
		this.futureValue = balance * Math.pow((1+ interestRate ), years);
		
		
		
		return this.futureValue;
	}
	public String toString() {
		
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		String fV = numberFormat.format(this.futureValue);
		
		String clientCheckingAccount = "Balance: $" + this.balance +"\n" +
										"Interest Rate: " +this.interestRate + "\n"+ 
										"Balance in 3 years: " + fV ;
		return clientCheckingAccount;
	}
	
	
}