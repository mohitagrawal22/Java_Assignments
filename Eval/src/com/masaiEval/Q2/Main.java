package com.masaiEval.Q2;

import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Students you want to enter");
		int num = sc.nextInt();
		
		for(int i = 0; i<num ;i++)
		{
			Student s = new Student();
			
			System.out.println("Enter the Roll Number :");
			int roll = sc.nextInt();
			s.setRoll(roll);
			
			sc.nextLine();
			System.out.println("Enter the Name :");
			String name = sc.nextLine();
			s.setRoll(name);
			
			System.out.println("Enter the marks :");
			int marks = sc.nextInt();
			s.setMarks(marks);
			
			System.out.println("Student Detail: "+(i+1));
			System.out.println("Student Roll Number: "+roll);
			System.out.println("Student Name: "+name);
			System.out.println("Student Mark: "+marks);
			System.out.println("=================================");
			
		}
		
		

	}


}
