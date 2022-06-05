package com.masaiDay5Q1;

import java.util.Scanner;

class EmployeeMain {
	
	public static Employee getEmployeeDetails() {
		Employee emp = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id");
		emp.setEmployeeId(sc.nextInt());
		
		System.out.println("Enter Employee Name");
		emp.setEmployeeName(sc.next());
		
		System.out.println("Enter Employee Salary");
		emp.setSalary(sc.nextDouble());
		
		return emp;
	}
	
	public static int getPFPercentage() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter PF Percentage");
		int pfPercentage = sc.nextInt();
		
		sc.close();
		
		return pfPercentage;
	}
	
	
	public static void main(String[] args) {
		
		Employee emp = EmployeeMain.getEmployeeDetails();
		
		int pfPercentage = EmployeeMain.getPFPercentage();
		
		emp.calculateNetSalary(pfPercentage);
		
		System.out.println("Id: " + emp.getEmployeeId());
		System.out.println("Name: " + emp.getEmployeeName());
		System.out.println("Salary: " + emp.getSalary());
		System.out.println("Net Salary: " + emp.getNetSalary());
	}
}