package com.masaiQ4;

import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Main {
	
	int calculateAge(String userDate) throws InvalidDateFormat{
		int age = 0;
		try {
			LocalDate dob = LocalDate.parse(userDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			LocalDate today = LocalDate.now();
			if(dob.isAfter(today)) {
				System.out.println(" Date of birth should not be in future ");
				//System.out.println(today);
			}
			else {
				age = (int) ChronoUnit.YEARS.between(dob, today);
			}
			return age;
		}
		catch(Exception e) {
			throw new InvalidDateFormat("please pass the date in the proper format.");
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter your Date of Birth in DD/MM/YYYY format only:");
			String userDate = sc.next();
			int ageU = new Main().calculateAge(userDate);
			LocalDate current=LocalDate.now();
			
			if(ageU>=18)
				System.out.println("You are eligible to cast your vote");
			
			else if( ageU>=18 && current.equals(userDate) )
			{
				System.out.println("Happy Birthday, You are eligible to cast your vote.");
			}
			
	}
		catch(InvalidDateFormat invalid) {
			System.out.println(invalid.getMessage());
		}
		finally {
			sc.close();
		}
	}
}