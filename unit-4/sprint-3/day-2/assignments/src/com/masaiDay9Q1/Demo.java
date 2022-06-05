package com.masaiDay9Q1;

import java.util.regex.Pattern;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username:");
		String username = sc.next();
		boolean usernameCheck = Pattern.matches("[a-zA-Z]{3,8}", username);
		if(!usernameCheck) {
			System.out.println("Username should contain only alphabets and length should be 3-8 characters");
			return;
		}
		
		System.out.println("Enter password:");
		String password = sc.next();
		boolean passwordCheck = Pattern.matches("[a-zA-Z0-9]{3,8}", password);
		if(!passwordCheck) {
			System.out.println("Password should be alphanumeric and length should be 3-8 characters");
			return;
		}
		
		System.out.println("Enter your mobile number:");
		String mobileNumber = sc.next();
		boolean mobileNumberCheck = Pattern.matches("[6789]{1}[0-9]{9}", mobileNumber);
		if(!mobileNumberCheck) {
			System.out.println("Mobile number is invalid! Enter Indian mobile number");
			return;
		}
		
		System.out.println("Enter your email id:");
		String email = sc.next();
		boolean emailCheck = Pattern.matches("[a-zA-Z0-9!#$]+@[a-z]+\\.[a-z]{2,5}", email);
		if(!emailCheck) {
			System.out.println("Please enter valid email address");
			return;
		}
		

		if(usernameCheck && passwordCheck && mobileNumberCheck && emailCheck) {
			Customer c = new Customer(username, password, mobileNumber, email);
			System.out.println(c);
		}
		
		sc.close();
	}
}