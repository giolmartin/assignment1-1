package com.meritamerica.assignment1;

import java.util.Scanner;

public class AccountHolder {

	private String firstName = "";
	private String middleName = "";
	private String lastName = "";
	private String ssn = "";
	private double checkingAccountOpeningBalance = 0;
	private double savingsAccountOpeningBalance = 0;
	private CheckingAccount clientCheckingAccount = new CheckingAccount(0);
	private SavingsAccount clientSavingsAccount = new SavingsAccount(0);
	
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
	public void setFirstName(String firstName) {
		this.firstName= firstName; 
	}
	public void setMiddleName(String middleName) {
		 this.middleName = middleName;
		
	}
	public void setLastName(String lastName) {
		 this.lastName = lastName;
	}
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	/*
	 *this method is going to return a String variable that contains all the information from the client. So for example, savings and checking account variables
	 *that are double, will return as a String. All calculations must be done in their respective methods and rewrite the variable as needed. that is my best guess.  
	 */
	public CheckingAccount getCheckingAccount() {
		CheckingAccount clientCheckingAccount = new CheckingAccount(checkingAccountOpeningBalance);
		this.clientCheckingAccount = clientCheckingAccount;
		return this.clientCheckingAccount;
	}
	
	public SavingsAccount getSavingsAccount() {
		SavingsAccount clientSavingsAccount = new SavingsAccount(savingsAccountOpeningBalance);
		return clientSavingsAccount;
	}

	
	public String toString() {
		String client = "Name: " + this.firstName + " " + this.middleName + " " + this.lastName + "\n" + 
						"SSN: " + this.ssn + "\n" + 
						"Checking Account Balance: $" + getCheckingAccount().getBalance() + "\n" + 
						"Savings Account Balance: $" + getSavingsAccount().getBalance();
		return client;
	}
	

	
	
	//SavingsAccount getSavingsAccount();
	//public String x.toString()

}