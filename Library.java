package com.library.books;

public class Library{

	public String libraryName;
	public int totalBooks;
	
	public void setLibraryName(String libraryName){

		this.libraryName=libraryName;
	}

	public void setTotalBooks(int totalBooks){

		this.totalBooks=totalBooks;
	}

	public String getLibraryName(){

		return libraryName;
	}
	
	public int getTotalBooks(){

		return totalBooks;
	}
	
	public void showLibraryDetails(){

		System.out.println("Library Name :" +libraryName);
		System.out.println("Total Books :" +totalBooks);
	}



}