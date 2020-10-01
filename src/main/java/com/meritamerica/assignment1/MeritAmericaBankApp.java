package com.meritamerica.assignment1;

public class MeritAmericaBankApp  {

	public static void main(String args[]) {

		
		  String firstName = "John";
		String middleName = "James";
		String lastName = "Doe";
		String ssn = "123-45-6789";
		double checkingAccountOpeningBalance = 100;//switch to positive if you want to add balance, this was just to test the boolean deposit() in checkingAccount.java
		double savingsAccountOpeningBalance = 1000;
		 
		AccountHolder client = new AccountHolder(firstName,middleName,lastName,ssn
												,checkingAccountOpeningBalance,savingsAccountOpeningBalance);
		
		System.out.println(client.getSavingsAccount().toString());
		
		
		//System.out.println(client.toString());
		//System.out.println("Next checking account toString: ");
		System.out.println(client.getCheckingAccount().toString());
		//System.out.println("Next Saving account future value");
		//System.out.println(client.getSavingsAccount().futureValue(3));
		 
	}
}