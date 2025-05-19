package com.company.app;

import com.company.hr.Employee;

import com.company.admin.Department;

public class CompanyApp {

	public static void main(String []args) {

		Employee emp = new Employee();
		emp.setId(1001);
		emp.setName("Bhargavi");
		emp.setSalary(70000.00);


		Department dept = new Department();
		dept.setDeptName("Software developer");
		dept.setDeptId(201);

		emp.showEmployeeDetails();
		System.out.println();
		dept.showDepartmentDetails();

	}
}