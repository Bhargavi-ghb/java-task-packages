package com.bank.app ;

import  com.bank.accounts.BankAccount ;

import  com.bank.customers.Customer  ;

public class BankApp{

	public static void main(String []args){
		
		BankAccount  bankaccount  = new BankAccount ();
		bankaccount .setAccountNumber ("Apgb100345");
		bankaccount .setBalance (1500);


		 Customer customer = new Customer ();
		 customer.setCustomerName("Bhargavi");
		 customer.setCustomerId(15);

		
		bankaccount.showAccountDetails();
		System.out.println();
		customer.showCustomerDetails();

		
	}

}