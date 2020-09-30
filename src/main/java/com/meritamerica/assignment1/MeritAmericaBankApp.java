package com.meritamerica.assignment1;

public class MeritAmericaBankApp {

	public static void main(String args[]) {
		
		String firstName = "";
		String middleName = "";
		String lastName = "";
		String ssn = "";
		
		AccountHolder client = new AccountHolder();
		 firstName = client.setFirstName();
		 middleName = client.setMiddleName();
		 lastName = client.setLastName();
		 ssn = client.setSSN();
		
		 
		client = new AccountHolder(firstName,middleName,lastName,ssn,100.0,1000.0);
		client.getFirstName();
		client.getMiddleName();
		client.getLastName();
		client.getSSN();
		CheckingAccount checkingAccount = new CheckingAccount(100);
		System.out.println(checkingAccount.getBalance());
		
		
		
	}
}