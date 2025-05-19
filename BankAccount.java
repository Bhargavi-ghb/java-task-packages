package com.bank.accounts;

public class  BankAccount{											
	public String accountNumber;
	public double balance;
	
	
	public void setAccountNumber(String accountNumber){

		this.accountNumber=accountNumber;
	}
	
	public void setBalance(double balance){

		this.balance=balance;
	}

	
	public String getAccountNumber(){

		return accountNumber;
	}
	
	public  double getBalance(){

		return balance;
	}

	public void showAccountDetails(){

				System.out.println(" Account Number:" +accountNumber);
		System.out.println(" Balance:" +balance);
	}



}