package com.meritamerica.assignment1;

import java.util.Scanner;
import java.math.*;

public class CheckingAccount {
	
	Scanner input = new Scanner(System.in);
	private double balance  = 0;
	
	/*
	 * Here im still not sure where we need to do the math to deposit or withdraw. Is it on the boolean method or on the constructor? 
	 * i kind of played around with the balances just to see if the amounts were being called and written. 
	 */
	public CheckingAccount(double openingBalance) {
		deposit(openingBalance);		
	}
	
	public double getBalance() {
		
		return balance;
	}
	
	private double getInterestRate() {
		double interestAmount = 0;
		return interestAmount;
	}
	private boolean withdraw(double amount) {
		return true;
	}
	
	private boolean deposit(double amount) {
		if (0 < amount) {
			this.balance = this.balance + amount;
			return true;
		} 	else {
		System.out.println("Error found: The amount entered for checking Account could not be processed. "); // This line will kick in if the amount is negative. so it wont add new balance
																										
		return false;
			}	
	}
		
		
	
	private double futureValue(int years) {
		
		return 0;
	}
	
	
}