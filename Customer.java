package com.bank.customers ;

public class  Customer{											
	public String customerName;
	public int customerId;
	
	
	public void setCustomerName(String customerName){

		this.customerName=customerName;
	}
	public void setCustomerId(int customerId){

		this.customerId=customerId;
	}
	public String getcustomerName(){

		return customerName;
	}
	
	public  int getcustomerId(){

		return customerId;
	}

	public void showCustomerDetails(){

				System.out.println("Customer Name :" +customerName);
		System.out.println("CustomerId:" +customerId);
	}



}