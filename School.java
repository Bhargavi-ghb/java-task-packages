package com.school.management;

public class School{

	public String name;
	public String location;
	
	public void setName(String name){

		this.name=name;
	}

	public void setLocation(String location){

		this.location=location;
	}

	public String getName(){

		return name;
	}
	
	public String getLocation(){

		return location;
	}
	
	public void showSchoolInfo(){

		System.out.println("School Name :" +name);
		System.out.println("School Location :" +location);
	}



}