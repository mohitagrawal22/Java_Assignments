package com.masai;

import java.util.Scanner;

public class MainEvalC2Q5Employee {


		public static EvalC2Q5Employee getEmployeeDetails() {
			EvalC2Q5Employee e1=new EvalC2Q5Employee();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Id: ");
			int id=sc.nextInt();
			e1.setEmployeeId(id);
			
			System.out.println("Enter Name: ");
			String name=sc.next();
			e1.setEmployeeName(name);
			
			System.out.println("Enter salary: ");
			double salary=sc.nextDouble();
			e1.setNetSalary(salary);
			
			System.out.println("Enter PF percentage: ");
			double PF=sc.nextDouble();
			e1.calculateNetSalary(PF);
			sc.close();

			return e1;
		}
		public static void main(String[] args) {
			
			EvalC2Q5Employee E1= getEmployeeDetails();
			System.out.println("Id : "+E1.getEmployeeId());
			System.out.println("Name : "+E1.getEmployeeName());
			System.out.println("Salary : "+E1.getSalary());
			System.out.println("Net Salary : "+E1.getNetSalary());
		}

	}

	
	

