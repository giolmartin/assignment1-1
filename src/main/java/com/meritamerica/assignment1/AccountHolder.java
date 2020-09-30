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
	
	public AccountHolder(String firstName, String middleName, String lastName, String ssn, 
			double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
		
	}
	
	public void getFirstName() {
		System.out.println(this.firstName);
	}
	
	public String setFirstName() {
		System.out.print("First Name: ");
		String firstName = input.next();
		
		return firstName;
		
	}
	
	public void getMiddleName() {
		System.out.println(this.middleName);
		
	}
	
	public String setMiddleName() {
		System.out.print("Middle Name: ");
		String middleName = input.next();
		
		return middleName;
	}
	
	public void getLastName() {
		System.out.println(this.lastName);
	}
	
	public String setLastName() {
		System.out.print("Last Name: ");
		String lastName = input.next();
		
		return lastName;
	}
	
	public void getSSN() {
		System.out.println(this.ssn);
	}
	public String setSSN() {
		System.out.print("SSN: ");
		String ssn = input.next();
		
		return ssn;	
	}


	
	
	//SavingsAccount.getSavingsAccount();
	//public String x.toString()

}