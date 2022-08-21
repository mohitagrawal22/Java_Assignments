package com.masai;

import java.util.ArrayList;
import java.util.Scanner;

public class MainDay15Q4 {
	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Employee> list = new ArrayList<>();
	
	public static void enterDetails() {
		
		System.out.println("Enter the Employee Id: ");
		Integer emp_id = sc.nextInt();
		System.out.println("Enter the Employee Name:");
		String emp_name = sc.next();
		System.out.println("Enter the Employee Salary: ");
		Double emp_salary = sc.nextDouble();
		System.out.println("Enter the Department Id:");
		Integer dept_id = sc.nextInt();
		System.out.println("Enter the Department Name:");
		String dept_name= sc.next();
		
		Employee emp_obj= new Employee(emp_id,emp_name,emp_salary,new Department(dept_id,dept_name));
		list.add(emp_obj);
		
		System.out.println("Employee Details added successfully.");
		
	}

	public static void main(String[] args) {
		
		System.out.println("Do You wish to Enter Employee details (Y/N) :");
		String choice = sc.next();
		
		
		while(true) {
		
			if(choice.equals("Y") || choice.equals("y")) {
		

				enterDetails();
						
				System.out.println("Do You wish to Enter more Employee details (Y/N) :");
				choice = sc.next();
		
			}
			else if(choice.equals("N") || choice.equals("n")) {
				break;	
			}
			else {
				System.out.println("Invalid Entry! \nDo You wish to Enter more Employee details (Y/N) :");
				choice = sc.next();
			}
		}
		
		
		while(true) {
			
			System.out.println("Enter the your choice "
					+ "\n1: Find Employee in Particular Department"
					+ " \n2:Remove Particular Employee "
					+ "\n3: Print Employees in All Departments"
					+ "\n4: Add Employee ");
			int choice2=sc.nextInt();
		
			if(choice2==1) {
				
				System.out.println("Enter the Department Id: ");
				Integer searchDeptId=sc.nextInt();
				
				System.out.println("Employee in Department: "+searchDeptId);
				
				for(Employee e:list) {
					
					if(searchDeptId == e.getDepartment().getDepartmentId() ) {
						
						System.out.println("Employee Name:"+e.getEmployeeName()); 
						System.out.println("Employee Id:"+e.getEmployeeId());
						System.out.println("Employee Salary:"+e.getEmployeeSalary());
						System.out.println("======================================");
						
					}
			
				}
			}
			else if(choice2==2) {
				
				System.out.println("Enter the Employee Id: ");
				int searchEmpId=sc.nextInt();
				
				String removedEmpName="";
				
				for(Employee e:list) {
					
					if(searchEmpId == e.getEmployeeId() ) {
						removedEmpName=e.getEmployeeName();
						list.remove(e);
						
					}
				}
				
				System.out.println(removedEmpName+" is Removed Successfully.");
			
			}
			else if(choice2==3) {
			
				for(Employee e:list) {
					System.out.println(e);
					System.out.println("------------------------------------------------");
				}
			
			}
			
			else if(choice2==4) {
				
				enterDetails();
				
			}
			
			else {
				System.out.println("Invalid Entry!");
			}
			
			
			boolean flag=false;
			while(true) {
				
				System.out.println("Do you want to Exit: ? (Y/N)");
				String choice3= sc.next();
			
				if(choice3.equals("Y") || choice3.equals("y")) {
				
					flag=true;
					break;
					
				}
				else if(choice3.equals("N") || choice3.equals("n")) {
				
					flag=false;
					break;
				
				}
				else {
					System.out.println("Invalid Entry! \nDo you want to Exit: ? (Y/N)");
					choice3= sc.next();
				}
			
			}
			
			if(flag) {
				break;
			}
		
		}
		
		
	}
	
}
		
	
	
		




