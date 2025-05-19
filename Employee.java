package com.company.hr;

public class  Employee{													
	public int id;
	public String name;
	public double salary;
	
	public void setId(int id){

		this.id=id;
	}

	public void setName(String name){

		this.name=name;
	}
	
	public void setSalary(double salary){

		this.salary=salary;
	}


	public  int getId(){

		return id;
	}
	
	public String getName(){

		return name;
	}
	
	public  double getSalary(){

		return salary;
	}

	public void showEmployeeDetails(){

		System.out.println(" Employee Id :" +id);
		System.out.println(" Employee Name :" +name);
		System.out.println(" Employee salary:" +salary);
	}



}