package com.masaiEval.Q4;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Laptop gamingLaptop=getLaptop("gaming");//You need to take input Using Scanner Class
		gamingLaptop.displayDetails();
		gamingLaptop.setColor("Black");
		gamingLaptop.setCompanyName("Acer");
		gamingLaptop.setName("Hp");
		gamingLaptop.setPurpose("gaming");
		Laptop bussinessLaptop=getLaptop("business");//You need to take input Using Scanner Class
		bussinessLaptop.displayDetails();
		Laptop laptop=getLaptop("Entertainment");//You need to take input Using Scanner Class
	}
	public static Laptop getLaptop(String laptopPurpose){
		Laptop l1= new Laptop();
		if(gaming) {
			
		}
		return l1;
	}
	
}
