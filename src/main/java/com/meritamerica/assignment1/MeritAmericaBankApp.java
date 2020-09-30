package com.meritamerica.assignment1;

public class MeritAmericaBankApp  {

	public static void main(String args[]) {
		
		String firstName = "John";
		String middleName = "James";
		String lastName = "Doe";
		String ssn = "123-45-6789";
		double checkingAccountOpeningBalance = 10;//switch to positive if you want to add balance, this was just to test the boolean deposit() in checkingAccount.java
		double savingsAccountOpeningBalance = 80;
		 
		AccountHolder client = new AccountHolder(firstName,middleName,lastName,ssn,checkingAccountOpeningBalance,savingsAccountOpeningBalance);
		System.out.println(client.toString());
		
		System.out.println(client.getSavingsAccount().futureValue(3));
		
		
		//AccountHolder client = new AccountHolder();
		 //System.out.print("First Name: ");
		//firstName = client.setFirstName();
		//middleName = client.setMiddleName();
		//lastName = client.setLastName();
		//ssn = client.setSSN();
	}
}