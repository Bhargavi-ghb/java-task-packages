package com.school.app;

import  com.school.management.School;

import  com.school.staff.Principal;

public class SchoolApp{

	public static void main(String []args){
		
		School school = new School();
		school.setName("Vigan high school");
		school.setLocation("Bestavaripeta");


		Principal principal = new Principal();
		principal.setPrincipalName("Usha");
		principal.setExperienceYears(15);

		
		school.showSchoolInfo();
		System.out.println();
		principal.showPrincipalInfo();

		
	}

}