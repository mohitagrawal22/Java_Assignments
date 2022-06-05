package com.masaiDay10Q3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("start of Main");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter first number:");
			
			int num1 = sc.nextInt();
			System.out.println("Enter second number:");
			int num2 = sc.nextInt();
			String message = null;
			int num3 = num1 / num2;
			if(num3 > 10){
			message = "Welcome to Exception Handling ";
			} 
			System.out.println("Message is :"+ message.toUpperCase());
		}
		catch(InputMismatchException ime) {
			System.out.println("Please enter a valid number!");
		}
		catch(ArithmeticException ae) {
			System.out.println("Second Number cannot be 0");
		}
		catch(NullPointerException npe) {
			System.out.println("String value is null");
		}

		System.out.println("end of Main");
	}
}