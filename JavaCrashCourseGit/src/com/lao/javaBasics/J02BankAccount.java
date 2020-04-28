// Java Crash course | 02 | Intro | Project, Class, Variables, Data Types, Functions, Wrapper Classes

package com.lao.javaBasics;

public class J02BankAccount {

	// Data - All the below 3 lines
	Long account_number = 1234567890l; // Long - Wrapper class
	String account_holder = "Raguraman";
	int account_bal = 10000; // int - primitive data type

	// User defined methods. This will act on data.
	public void getBalance() {
		System.out.println("Account balance is " + account_bal);
	}
	
	public void getAccountNumber()
	{
		System.out.println("Account number is "+ account_number);
	}
	
	// In built method
	public static void main(String[] args) {
		
		// Create object so that I can use class data and methods.
		J02BankAccount account = new J02BankAccount();
		
		// Calling methods
		account.getBalance();
		account.getAccountNumber();
		
		// Calling data
		String acc_hold = account.account_holder;
		System.out.println(acc_hold);
	}

}
