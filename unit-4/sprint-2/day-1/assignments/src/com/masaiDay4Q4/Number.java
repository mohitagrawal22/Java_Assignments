package com.masaiDay4Q4;

public class Number {
  
	
	void checkNumber(int number)
	{
		
		if(number<0)
		{
		   System.out.println("Error");	
		}
	else if(number%2==0)
		{
			int val=number + (10 - number % 10);
			System.out.println(val); 
		}
		else if(number%2!=0)
		{
			System.out.println(number);
		}
	}
	
	
	
	
	public static void main(String[] args) {

          Number n1 = new Number();
          
          n1.checkNumber(17);

	}

}
