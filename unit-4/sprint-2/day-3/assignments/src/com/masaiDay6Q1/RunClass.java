package com.masaiDay6Q1;

import java.util.Scanner;

public class RunClass {

	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name:");
		String studentName = sc.nextLine();
		
		System.out.println("Enter Student Id:");
		int studentId = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Exam Fee");
		double examFee = Double.parseDouble(sc.nextLine());
		
		Student s  = new Student(studentId,studentName,examFee);
		s.displayDetails();
		
		DayScholar ds = new DayScholar();
		  ds.setTransportFee(1500);
		  
		  double hostelFee = ds.payFee();
		   
		  System.out.println("HostelFee :"+hostelFee);
		  
		 Hosteller hs = new Hosteller();
		  hs.setHostelFee(6000);
         
		  double transportFee = hs.payFee();
		 
		  System.out.println("Transport Fee: "+transportFee);
		 
		 
	sc.close();	
	}
	
}