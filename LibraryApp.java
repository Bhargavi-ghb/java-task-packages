package com.library.app ;

import  com.library.books.Library ;

import  com.library.staff.Librarian ;

public class LibraryApp{

	public static void main(String []args){
		
		Library library = new Library();
		library.setLibraryName("vigan");
		library.setTotalBooks(1500);


		Librarian librarian = new Librarian();
		librarian.setLibrarianName("Thanmai");
		librarian.setYearOfExperience(15);

		
		library.showLibraryDetails();
		System.out.println();
		librarian.showLibrarianInfo();
		
	}

}