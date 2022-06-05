package com.masaiDay6Q2;

import java.util.Scanner;

public class Main {
	

	public static Hosteller getHostellerDetails() {
		Hosteller hostelStudent = new Hosteller();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Id:");
		hostelStudent.setStudentId(sc.nextInt());
		
		System.out.println("Enter Student Name:");
		hostelStudent.setName(sc.next());
		
		System.out.println("Enter Department Id: ");
		hostelStudent.setDepartmentId(sc.nextInt());
		
		System.out.println("Enter Gender: ");
		hostelStudent.setGender(sc.next());
		
		System.out.println("Enter Phone Number: ");
		hostelStudent.setPhone(sc.next());
		
		System.out.println("Enter Hostel Name: ");
		hostelStudent.setHostelName(sc.next());
		
		System.out.println("Enter Room Number: ");
		hostelStudent.setRoomNumber(sc.nextInt());
		
		System.out.println("Do you wish to Modify Room Number? (Y/N)");
		String choice = sc.next();
		if(choice.equals("Y")) {
			System.out.println("Enter New Room Number: ");
			hostelStudent.setRoomNumber(sc.nextInt());
		}
		
		System.out.println("Do you wish to Modify Phone Number? (Y/N)");
		choice = sc.next();
		if(choice.equals("Y")) {
			System.out.println("Enter New Phone Number: ");
			hostelStudent.setPhone(sc.next());
		}
		
		
		return hostelStudent;
	}
	
	
	
	public static void main(String[] args) {

		Hosteller hostelStudent =  Main.getHostellerDetails();	
		System.out.println(hostelStudent);
	
	}
}