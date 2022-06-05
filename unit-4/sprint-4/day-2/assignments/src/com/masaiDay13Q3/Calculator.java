package com.masaiDay13Q3;

import java.util.function.Predicate;
import java.util.Scanner;

public class Calculator implements Inrr{



	@Override
	public long Square(long a) {
		
		return a*a;
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int b = (int)(Math.random()*(100-(-10))+0);  
		
		 Predicate<Integer> p = i -> i > 0;
		 System.out.println(p.test(b));
		 
		 System.out.println(b);

		
	    Inrr i1 = new Calculator();
	   long R =   i1.Square(b);
	    
	   System.out.println("Square of Random Number is: " + R);
	   
	  
	 
	    
		
		sc.close();
		
		
		
	}

	
	

	
	
}