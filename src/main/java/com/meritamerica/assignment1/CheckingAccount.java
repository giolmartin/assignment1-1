package com.meritamerica.assignment1;

import java.util.Scanner;

public class CheckingAccount {
	
	Scanner input = new Scanner(System.in);
	private double balance  = 0;
	
	public CheckingAccount(double openingBalance) {
		
		if(deposit(openingBalance) == true) {
			balance = balance + openingBalance;
		}
		
		
	}
	
	public double getBalance() {
		double balanceCurrent = balance;
		System.out.println("Im on  getBalance()");
		return balanceCurrent;
	}
	
	private double getInterestRate() {
		
		return 0;
	}
	private boolean withdraw(double amount) {
		return true;
	}
	
	private boolean deposit(double amount) {
		if (0 < amount) 
			return true;
		return false;
		
	}
	private double futureValue(int years) {
		
		return 0;
	}
	
	
}