package com.masaiEvalQ3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		
		
		Address empAdd = new Address("Mumbai", "Maharashtra", "400101");
		
		Employee empDetail = new Employee(123, "Mohit", empAdd, "mohitrocks@gmail.com","P@ssword");
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Employee.txt"));
		
		out.writeObject(empDetail);
		
		out.flush();
		out.close();
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Employee.txt"));
		Employee employeeDetails = (Employee)ois.readObject();
		System.out.println("Employee Details: ");
		
		System.out.println("Employee Id : "+ employeeDetails.getEmpId());
		System.out.println("Employee Name : "+ employeeDetails.getEmpName());
		System.out.println("Address : " + employeeDetails.getAddress());
		System.out.println("Email : " + employeeDetails.getEmail());
		System.out.println("Password : " +employeeDetails.getPassword());
		
		ois.close();
	}

}