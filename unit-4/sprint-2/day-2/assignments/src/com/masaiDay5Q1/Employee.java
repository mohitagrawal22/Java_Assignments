package com.masaiDay5Q1;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	public Employee() {
		
	}
	
	public int getEmployeeId() {
		return this.employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getNetSalary() {
		return this.netSalary;
	}
	
	public void calculateNetSalary(int pfPercentage) {
		double pfAmount = ((this.salary/100) * pfPercentage);
		this.netSalary = this.salary - pfAmount;
	}
}