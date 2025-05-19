package com.library.staff;

public class Librarian{

	public String librarianName;
	public int yearOfExperience;
	
	public void setLibrarianName(String librarianName){

		this.librarianName = librarianName;
	}

	public void setYearOfExperience(int yearOfExperience){

		this.yearOfExperience=yearOfExperience;
	}

	public String getLibrarianName(){

		return librarianName;
	}
	
	public int getYearOfExperience(){

		return yearOfExperience;
	}
	
	public void showLibrarianInfo(){

		System.out.println("Librarian Name :" +librarianName);
		System.out.println("Year Of Experience :" +yearOfExperience);
	}



}