package com.meritamerica.assignment1;

import java.util.Scanner;

public class AccountHolder {
	
	 Scanner input = new Scanner(System.in);
	
	 private String firstName = "";
	private String middleName = "";
	private String lastName = "";
	private String ssn = "";
	private double checkingAccountOpeningBalance = 0;
	private double savingsAccountOpeningBalance = 0;
	
	
	
	
	public AccountHolder(){	
	}
	
	/*
	 * Variables that are entered when calling this AccountHolder constructor are stored in private instance variables().
	 * That way they can be called from any method without having to create and pass down another copy.
	 * for ex : instead of what we were doing 
	 * getFirstName(String firstName){
	 * String fN = firstName;
	 * return fN;
	 * } ---> now is more simple by just returning the variable to whoever calls it. ---> check lesson 9 and 10 of stanford to see this implemenation. 
	 * 
	 */
	public AccountHolder(String firstName, String middleName, String lastName, String ssn, 
			double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
		
	}
	
	/*
	 * returns instance variable firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}
	
	/*
	 * returns instance variable middleName
	 */
	public String getMiddleName() {
		return this.middleName;
	}
	
	/*
	 * returns instance variable lastName
	 */
	public String getLastName() {
		return this.lastName;

	}
	/*
	 * returns instance variable ssn
	 */
	public String getSSN() {
		return this.ssn;
	}
	
	/*
	 * All the set....() rewrite the variable as input. But I believe this needs to be called in MeritAmericaBankApp.java class. There is an example commented there
	 * if you want to mess with that code and see how it relates. 
	 */
	public void setFirstName() {
		this.firstName= input.next();
	}
	public void setMiddleName() {
		 this.middleName = input.next();
		
	}
	public void setLastName() {
		 this.lastName = input.next();
		
	}
	public void setSSN() {
		this.ssn = input.next();
	}
	
	/*
	 *this method is going to return a String variable that contains all the information from the client. So for example, savings and checking account variables
	 *that are double, will return as a String. All calculations must be done in their respective methods and rewrite the variable as needed. that is my best guess.  
	 */
	public CheckingAccount getCheckingAccount() {
		CheckingAccount client = new CheckingAccount(0);
		return client;
		
		
	}
	
	public String toString() {
		String client = "Name: " + this.firstName + " " + this.middleName + " " + this.lastName + "\n" + 
						"SSN: " + this.ssn + "\n" + 
						"Checking Account Balance: $" + getCheckingAccount().getBalance() + "\n" + 
						"Savings Account Balance: $" + this.savingsAccountOpeningBalance;
		return client;
	}


	
	
	//SavingsAccount.getSavingsAccount();
	//public String x.toString()

}